//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University universitate = new University();
        int[] arr = {50, 81, 100, 60, 10, 38, 86, 98, 99, 94};

        for(int i = 0; i < universitate.filterBadGrades(arr).length; i++)
            System.out.println(universitate.filterBadGrades(arr)[i] + " ");

        System.out.println( universitate.calculateAverage(arr));

        for(int grade : universitate.round(arr)){
            System.out.println(grade);
        }

        System.out.println(universitate.maximumRoundedGrade(arr));


        ArrayOperations array = new ArrayOperations(arr);
        System.out.println(array.findMax());
        System.out.println(array.findMin());
        System.out.println(array.maximumSum());
        System.out.println(array.minimumSum());


        int[] bigNumber1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        BigNumber bigNumber = new BigNumber();

        for(int number : bigNumber.add(bigNumber1, bigNumber2)){
            System.out.printf(number + " ");
        }
        System.out.println(' ');
        for(int number : bigNumber.subtract(bigNumber3, bigNumber4)){
            System.out.printf(number + " ");
        }
        System.out.println(' ');
        for(int number : bigNumber.multiplyByDigit(bigNumber5, 2)){
            System.out.printf(number + " ");
        }

    }
}