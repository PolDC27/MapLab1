public class ArrayOperations {
    private final int[] array;

    ArrayOperations(int[] array){
        this.array = array;
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

    public int findMax(){
        return sortAscending(this.array)[this.array.length - 1];
    }

    public int findMin(){
        return sortAscending(this.array)[0];
    }
}
