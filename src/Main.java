//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University university = new University();
        int[] grades = {50, 81, 100, 60, 10, 38, 86, 98, 99, 94};

        System.out.println("Nicht ausreichende Noten: ");
        for(int i = 0; i < university.filterBadGrades(grades).length; i++)
            System.out.println(university.filterBadGrades(grades)[i] + " ");

        System.out.println("Durchschnittswert aller Noter: " + university.calculateAverage(grades));

        System.out.println("Abgerundete Noten: ");
        for(int grade : university.round(grades)){
            System.out.println(grade + " ");
        }

        System.out.println("Grosste abgerundete Note: " + university.maximumRoundedGrade(grades));


        ArrayOperations array = new ArrayOperations(grades);
        System.out.println("Maximale Zahl: " + array.findMax());
        System.out.println("Minimale Zahl: " + array.findMin());
        System.out.println("Maximale Summe von n-1 Zahlen: " + array.maximumSum());
        System.out.println("Minimale Summe von n-1 Zahlen: " + array.minimumSum());


        int[] bigNumber1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        BigNumber bigNumber = new BigNumber();

        System.out.println("Summe: ");
        for(int number : bigNumber.add(bigNumber1, bigNumber2)){
            System.out.printf(number + " ");
        }
        System.out.println("\nDifferenz: ");
        for(int number : bigNumber.subtract(bigNumber3, bigNumber4)){
            System.out.printf(number + " ");
        }
        System.out.println("\nMultiplikation: ");
        for(int number : bigNumber.multiplyByDigit(bigNumber5, 2)){
            System.out.printf(number + " ");
        }
        System.out.println("\nDivision: ");
        for(int number : bigNumber.divideByDigit(bigNumber5, 2)){
            System.out.printf(number + " ");
        }


        int[] keyboardPrices = {40, 35, 70, 15, 45};
        int[] usbPrices = {20, 15, 30, 15};
        ElectronicShop altex = new ElectronicShop(keyboardPrices, usbPrices);

        System.out.println("\nBilligste Tastatur: " + altex.lowestKeyboardPrice());
        System.out.println("Teuerster Gegenstand: " + altex.mostExpensiveProduct());
        System.out.println("Teuerstes USB Laufwerk, das Markus kaufan kann: " + altex.mostExpensiveAffordableUSB(30));
        System.out.println(altex.mostExpensiveAffordableCart(60));
    }

}