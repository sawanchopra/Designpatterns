package LeetCode.HashMapSet.Easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  i=0;i<arr.length;i++){
            int complement = target-arr[i];
           if(map.containsKey(complement)){
               return new int[]{map.get(complement),i};

           }else{
               map.put(arr[i],i);
           }
        }
        return new int[]{0,0};
    }
}
