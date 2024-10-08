public class ElectronicShop {
    private final int[]  keyboardsPrice, usbPrices;
    ElectronicShop(int[] keyboardsPrices, int[] usbPrices){
        this.keyboardsPrice = keyboardsPrices;
        this.usbPrices = usbPrices;
    }

    private int[] sortAscending(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;

            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public int lowestKeyboardPrice(){
           return sortAscending(this.keyboardsPrice)[0];
    }

    public int mostExpensiveProduct(){
        if(sortAscending(this.keyboardsPrice)[keyboardsPrice.length - 1] > sortAscending(this.usbPrices)[usbPrices.length - 1])
            return sortAscending(this.keyboardsPrice)[keyboardsPrice.length - 1];
        else return sortAscending(this.usbPrices)[usbPrices.length - 1];
    }

    public int mostExpensiveAffordableUSB(int budget){
        int i = 0;
        while(i < this.usbPrices.length && sortAscending(this.usbPrices)[i] <= budget)
            i++;
        return sortAscending(this.usbPrices)[i - 1];
    }

    public String mostExpensiveAffordableCart(int budget){
        int max = 0;
        int keyboardPrice = 0;
        int usbPrice = 0;

        for (int i = 0; i < usbPrices.length; i++){
            for (int j = 0; j < keyboardsPrice.length; j++){
                if (sortAscending(this.usbPrices)[i] + sortAscending(this.keyboardsPrice)[j] > budget){
                    break;
                }else{
                    if ((sortAscending(this.usbPrices)[i] + sortAscending(this.keyboardsPrice)[j] > max)){
                        max = sortAscending(this.usbPrices)[i] + sortAscending(this.keyboardsPrice)[j];
                        usbPrice = sortAscending(this.usbPrices)[i];
                        keyboardPrice = sortAscending(this.keyboardsPrice)[j];
                    }
                }
            }
        }
        if (max == 0){
            return "-1";
        }
        else {
            return "Max: " + max + " = " + usbPrice + " + " + keyboardPrice;
        }
    }

}
