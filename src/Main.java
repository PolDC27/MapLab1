//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    University universitate = new University();
    int[] arr = {50,20,100,60,10};
    for(int i = 0; i < universitate.filterBadGrades(arr).length; i++){
        System.out.printf(String.valueOf(universitate.filterBadGrades(arr)[i] + " "));
    }
    }
}