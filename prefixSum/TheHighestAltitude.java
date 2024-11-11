package LeetCode.prefixSum;

public class TheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int max =0;
        int sum =0;
        for(int g:gain){
            sum +=g;
            max =Math.max(max,sum);

        }
        return max;
    }
}
