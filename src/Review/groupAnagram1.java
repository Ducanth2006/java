package Review;

import java.util.*;

class solutionGA1{
    public List<List<String>> groupAnagram1(String[] strs){
        Map<String,List<String> > map=new HashMap<>();
        for(String x:strs){
            char [] dsChar=x.toCharArray();
            Arrays.sort(dsChar);
            String keys=String.valueOf(dsChar);
            if(!map.containsKey(keys)){
                map.put(keys,new ArrayList<>());
            }
            map.get(keys).add(x);
        }
        return new ArrayList<>(map.values());
    }
}
public class groupAnagram1 {
}
