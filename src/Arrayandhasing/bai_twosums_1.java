package Arrayandhasing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
// solution 1
//class Solution_twosums1 {
//    public int[] twoSum(int[] nums, int target) {
//        int n=nums.length;
//        int index1=0;
//        int index2=0;
//        for(int i=0;i<n;i++){
//            for(int k=i+1;k<n;k++){
//                if((nums[i]+nums[k]==target)){
//                    index1=i;
//                    index2=k;
//                    break;
//                }
//            }
//        }
//        return new int[] {index1,index2};
//
//    }
//}

//solution 2
class Solution_twosums1 {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int exception=target-nums[i];
            // cẩn thận khi target là 6 và quét i hiện tại là 3 nhé khi đó hashmap sẽ quét phải chính cái index
            // đó và cho nó là true nhé

            if(map.containsKey(exception) && !(map.get(exception)==i)){
                return new int[]{i,map.get(exception)};
            }
        }
        return new int[]{};
    }
}
public class bai_twosums_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []twosum= new int[n];
        for(int i=0;i<n;i++){
            twosum[i]=sc.nextInt();
        }

    }
}
