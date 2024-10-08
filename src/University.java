public class University {
    public int[] filterBadGrades(int[] grades){
        int[] badGrades = new int[0];
        for (int grade : grades) {
            if (grade < 40) {
                int[] auxiliaryArray = new int[badGrades.length + 1];
                System.arraycopy(badGrades, 0, auxiliaryArray, 0, badGrades.length);
                auxiliaryArray[auxiliaryArray.length - 1] = grade;
                badGrades = new int[auxiliaryArray.length];
                System.arraycopy(auxiliaryArray, 0, badGrades, 0, auxiliaryArray.length);
            }
        }
        return badGrades;
    }

    public double calculateAverageOf(int[] grades){
        double average = 0;

        for (int grade : grades) {
            average += grade;
        }
        average /= grades.length;

        return average;
    }

}
