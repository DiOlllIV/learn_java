package lesson4;

public class MethodExample {
    public static void main(String[] args) {
        int res = increaser(10, 5);

        System.out.println(res);

        int minRes = min(res, 11);

        System.out.println(minRes);
    }

    public static int increaser (int a, int index) {
        System.out.println("method invoked");
        a += index;
        System.out.println("method before return");
        return a;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
