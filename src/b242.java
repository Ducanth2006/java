package Array_and_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(String.valueOf(s.charAt(i)),map1.getOrDefault(String.valueOf(s.charAt(i)),0)+1);
        }
        for(int i=0;i<t.length();i++){
            map2.put(String.valueOf(t.charAt(i)),map2.getOrDefault(String.valueOf(t.charAt(i)),0)+1);
        }

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            // Kiểm tra nếu map2 không có key này hoặc giá trị khác nhau
           if(s.length()==t.length()){
               if (!map1.get(key).equals(map2.get(key))) {
                   return false; // Thoát hẳn hàm lớn tại đây
               }
           }
           else if(!(s.length()==t.length())){
               return false;
           }
        }
        return true;

    }
}
public class b242 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String t=sc.nextLine();
        Solution242 k=new Solution242();
        if(k.isAnagram(s,t)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
