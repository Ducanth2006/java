package Arrayandhasing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {

//      cách 1 sử dụng kích thước để tính và xử lý vì vậy nó sẽ tính tổng thể khá lâu
//        long n=nums.length;
//        Set<Integer> res= Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        long b=res.size();
//        if(n>b){
//            return true;
//        }
//        else{
//            return false;
//       }
//        cách 2 nhớ là at least nhé nên chỉ cần dò trúng là oke nhé
        Set<Integer> res=new HashSet<>();
        long n=nums.length;
        for(int i=0;i<n;i++){
            if(res.contains(nums[i])){
                return true;
            }
            res.add(nums[i]);
        }
        return false;

    }
}
public class b217 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] mang= new int[n];
        for(int i=0;i<n;i++){
            mang[i]= sc.nextInt();
        }
        Solution217 s= new Solution217();
        if(s.containsDuplicate(mang)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
