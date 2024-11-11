package LeetCode.StringArray;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

  /*  private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for(int i =0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                int prev = (i==0)?0:flowerbed[i-1];
                int next = (i==flowerbed.length-1)?0:flowerbed[i+1];
                if(prev==0&&next==0){
                    flowerbed[i] = 1;
                    count++;
                }

            }

        }
        return count>=n;
    }*/

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zercount =0;
        Boolean rsult = false;
        for(int i =0;i<flowerbed.length;i++){
         if(flowerbed[i]==1){
             zercount --;
             continue;
         }
         else if(flowerbed[i]==0 && zercount==0){
                zercount++;

         }
            else if(flowerbed[i]==0 && zercount==1){
                zercount++;
            }
            else if(flowerbed[i]==0 && zercount==2){
                zercount = 0;
                n--;
            }
        }
        if(zercount==1){
            n--;
        }
        if(n<=0){
            rsult = true;
        }
        return rsult;

    }
}
