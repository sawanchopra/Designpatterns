package TicTacToe;

import java.util.HashMap;

public class FIndNumberofCharaters {
    public static void main(String[] args) {
        String name = "Tanishq Chopra";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char ch[]=name.toCharArray();
        for (int i =0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);

            }else{
                map.put(ch[i],1);
            }
        }
        System.out.println(map);
    }
}
