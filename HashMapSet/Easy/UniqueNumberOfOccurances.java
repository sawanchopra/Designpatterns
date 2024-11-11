package LeetCode.HashMapSet.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurances {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    private static boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        HashSet UiqueValues = new HashSet(map.values());
        return map.size() == UiqueValues.size();
    }
}
