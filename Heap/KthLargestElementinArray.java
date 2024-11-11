package LeetCode.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementinArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }

    private static int findKthLargest(int[] nums, int i) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
            if(pq.size()>i){
                pq.poll();
            }

        }
        return pq.peek();
    }
}
