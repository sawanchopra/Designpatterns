package LeetCode;

import java.util.Arrays;

public class interview {
    public static void main(String[] args) {
        int [] arr = {1,2, 2, 3, 3, 4, 5, 5, 6, 6};
        removeduplicated(arr);
    }

    private static void removeduplicated(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        int [] temp = new int[j];
        for (int i = 0; i < j; i++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
