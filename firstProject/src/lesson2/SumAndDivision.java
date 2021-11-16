package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        int n = 1234;
        int division;
        int modulo;
        int sum = 0;

        for(int i = 0; i <= 1000; i++) {
            sum += i;
        }
        division = sum / n;
        modulo = sum % n;

        System.out.println(modulo > division);
    }
}
