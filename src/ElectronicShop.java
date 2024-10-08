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

}
