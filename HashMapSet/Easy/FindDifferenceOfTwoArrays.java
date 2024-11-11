package LeetCode.HashMapSet.Easy;

import java.util.*;

public class FindDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        System.out.println(findDifference(nums1, nums2));
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set set1 = new HashSet();
        Set set2 = new HashSet();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }

        Set resultSet1 = new HashSet();
        Set resultSet2 = new HashSet();
        for(int num:nums1){
            if(!set2.contains(num)){
                resultSet1.add(num);
            }

        }
        for(int num:nums2){
            if(!set1.contains(num)){
                resultSet2.add(num);
            }
        }

     return Arrays.asList(new ArrayList<>(resultSet1),new ArrayList<>(resultSet2));

    }
}
