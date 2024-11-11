package Interview;

import java.util.*;

class tracker {
    HashMap<Integer,Integer> map = new HashMap<>();
    Integer max = 0;
    Integer min = Integer.MAX_VALUE;
    Integer noofrequest = 0;
    Integer sum = 0;
    Double avg = 0d;
    Integer mode = 0;
    Integer count = 0;
    public void insert(Integer responseTime){
        noofrequest =noofrequest+1;
        sum = sum+responseTime;
        avg = Double.valueOf(sum/noofrequest);
        if(responseTime>max){
            max = responseTime;
        }
        if(responseTime<min){
            min = responseTime;
        }
        map.put(responseTime, map.getOrDefault(responseTime,0)+1);

        if(map.get(responseTime)>count){
            count = map.get(responseTime);
            mode = responseTime;
        }
        System.out.println(map);
    }

    public Integer getMax(){
        return max;
    }

    public Integer getMin(){
        return max;
    }

    public Double getAverage(){
        return avg;
    }

    public Integer getMode(){
        return mode;
    }






}