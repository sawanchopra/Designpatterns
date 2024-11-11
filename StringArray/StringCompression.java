package LeetCode.StringArray;

import java.util.LinkedHashMap;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        //compress(chars);
        System.out.println(compress(chars));
    }

    private static int compress(char[] chars) {
        LinkedHashMap <Character,Integer> map = new LinkedHashMap<>();
        for (char ch:chars){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        StringBuilder sb = new StringBuilder();
        map.forEach((k,v)->
                {
                    if(v>1)
                        sb.append(k).append(v);
                    else
                        sb.append(k);
                }
        );
        chars = sb.toString().toCharArray();
        System.out.println(chars);
        return chars.length;

    }
}


