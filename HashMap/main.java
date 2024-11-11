package HashMap;

import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<Integer,String>(7);
        map.put(1,"A");
        System.out.println(map.get(1));


    }
}
