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

    public double calculateAverage(int[] grades){
        double average = 0;

        for (int grade : grades) {
            average += grade;
        }
        average /= grades.length;

        return average;
    }

    public int[] round(int[] grades){
        int[] roundedGrades = new int[grades.length];

        for(int i = 0; i < roundedGrades.length; i++){
            if(grades[i] < 38){
              roundedGrades[i] = grades[i];
            }
            else{
                if((grades[i] + 2) % 5 == 0){
                    roundedGrades[i] = grades[i] + 2;
                }
                else if((grades[i] + 1) % 5 == 0){
                        roundedGrades[i] = grades[i] + 1;
                }else roundedGrades[i] = grades[i];
            }

        }
        return roundedGrades;
    }

    public int maximumRoundedGrade(int[] grades){
        int max = -1;

        for(int grade : this.round(grades)){
           if(grade > max){
             max = grade;
           }
        }
        return max;
    }
}
