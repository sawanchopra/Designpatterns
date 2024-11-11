package LeetCode.DynamicProgramming;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TotalCostToHireWorkers {
    public static void main(String[] args) {
        int[] costs = {17,12,10,2,7,2,11,20,8};
        int k = 3; int candidates = 4;
        System.out.println(mincostToHireWorkers(costs,k,candidates));
    }

    private static long mincostToHireWorkers(int[] costs, int k, int candidates) {
        int n = costs.length;
         long  totalCost = 0;
      PriorityQueue<Integer[]> pq = new PriorityQueue<>((a,b)->{
          if(a[0] != b[0]){
              return Integer.compare(a[0],b[0]);
          }
          else{
              return Integer.compare(a[1],b[1]);
          }
      });

      int left = 0;int right =n-1;
      for(int i =0;i<k;i++){

          while(left<=right && pq.size()<candidates){
              pq.offer(new Integer[]{costs[left],left});
              left++;
          }
          while(left<=right && pq.size()<candidates){
              pq.offer(new Integer[]{costs[right],right});
              right--;
          }
            Integer[] selectWorkerd = pq.poll();
            totalCost += selectWorkerd[0];
            costs[selectWorkerd[1]] = Integer.MAX_VALUE;

      }

         return totalCost;



    }

}
