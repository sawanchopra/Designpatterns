package LeetCode.LinkedList.Medium;

public class LRUcache {
    public static void main(String[] args) {
        Cache cache = new Cache(2);
        cache.put(1, 1); // cache is {1=1}
        cache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(cache.get(1)); // return 1
        cache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(cache.get(1)); // return -1
        System.out.println(cache.get(3)); // return 3
        System.out.println(cache.get(4)); // return 4
    }

}
