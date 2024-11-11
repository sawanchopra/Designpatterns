package LeetCode.Heap;

import com.sun.tools.javac.util.Pair;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubSequenceScore {
    public static void main(String[] args) {
        int[]  nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};
        int k = 3;
        System.out.println(maximumSunSequenceScore(nums1,nums2,k));
    }

    private static int maximumSunSequenceScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int [][] dp1 = new int[n][2];
        for(int i = 0; i<n;i++){
            dp1[i] = new int[] {nums1[i], nums2[i]};
        }
        Arrays.sort(dp1,(a,b)->(b[0]-a[0]));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k,(a,b)->a - b);
        return 0;


    }
}
