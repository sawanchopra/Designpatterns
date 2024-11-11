package LeetCode.StringArray;

public class NearestFibanocciNumber {
    public static void main(String[] args) {
        int[]n = {1, 2, 5};
        System.out.println(nearestFib(n));


    }

    private static int nearestFib(int[] n) {
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            max = Math.max(max, n[i]);
        }
        int[] fib = new int[100];
        fib[0] = 1;
        fib[1] = 1;
        int i = 2;
        while (fib[i - 1] < max) {
            fib[i] = fib[i - 1] + fib[i - 2];
            i++;
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n.length; j++) {
            for (int k = 0; k < i; k++) {
                min = Math.min(min, Math.abs(n[j] - fib[k]));
            }
        }
        return min;
    }
}
