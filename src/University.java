public class University {
    public int[] filterBadGrades(int[] array){
        int[] badGrades = new int[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < 40) {
                int[] auxiliarArray = new int[badGrades.length + 1];
                for(int j = 0; j < badGrades.length; j++) {
                    auxiliarArray[j] = badGrades[j];
                }
                auxiliarArray[auxiliarArray.length - 1] = array[i];
                badGrades = new int[auxiliarArray.length];
                for(int k = 0; k < auxiliarArray.length; k++) {
                    badGrades[k] = auxiliarArray[k];
                }
            }
        }
        return badGrades;
    }
}
