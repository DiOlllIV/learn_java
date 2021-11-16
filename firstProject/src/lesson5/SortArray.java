package lesson5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 0, 6, 4, 100, 24, 1, 2};

        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

    public static int[] sortAscending(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < sortedArr.length; i++) {
            int min = sortedArr[i];
            int minIdx = i;
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[j] < min) {
                    min = sortedArr[j];
                    minIdx = j;
                }
            }

            int temp = sortedArr[i];
            sortedArr[i] = min;
            sortedArr[minIdx] = temp;
        }

        return sortedArr;
    }

    public static int[] sortDescending(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < sortedArr.length; i++) {
            int min = sortedArr[i];
            int minIdx = i;
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[j] > min) {
                    min = sortedArr[j];
                    minIdx = j;
                }
            }

            int temp = sortedArr[i];
            sortedArr[i] = min;
            sortedArr[minIdx] = temp;
        }

        return sortedArr;
    }
}
