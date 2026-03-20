package Arrayandhasing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //Đã ghi nhận các giá trị xuất hiện xong
        // ghi nhớ phần này nhé nó giúp kha khá đấy
        List<Integer> resList= map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue()
                .reversed() ).limit(k).map(Map.Entry::getKey).collect(Collectors.toList());
//      tôi bị bí ở bước chuyển đổi từ List<Integer> sang int[]
        int[] resFinal=new int[k];
        for(int i=0;i<k;i++){
            resFinal[i]=resList.get(i);
        }
        return resFinal;


    }
}
