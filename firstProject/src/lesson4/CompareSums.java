package lesson4;

public class CompareSums {
    public static void main(String[] args) {
        System.out.println(compareSums(2,3, 1,3));
    }

    public static int sum(int a, int b) {
        int res = 0;

        for(int i = a; i <= b; i++){
            res += i;
        }

        return res;
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        int firstCount = sum(a, b);
        int secondCount = sum(c, d);

        return firstCount > secondCount;
    }
}
