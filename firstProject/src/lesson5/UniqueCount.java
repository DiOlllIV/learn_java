package lesson5;

public class UniqueCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 3, 4, 3, 5, 5, 6, 6, 6, 7};

        System.out.println(uniqueCount(array));
    }

    public static int uniqueCount(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count--;
                    break;
                }
            }
        }


        return count;
    }
}
