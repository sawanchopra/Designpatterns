package LeetCode.StringArray;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s,numRows));
    }

    private static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if(numRows == 1){
            return s;

        }
        for(int i=0;i<numRows;i++){
            int increment = 2*(numRows-1);
            for(int j=0;j+i<s.length();j+=increment){
                sb.append(s.charAt(j+i));
                if(i!=0 && i!=numRows-1 && j+increment-i<s.length()){
                    sb.append(s.charAt(j+increment-i));

                }

            }

        }
        return sb.toString();
    }
}
