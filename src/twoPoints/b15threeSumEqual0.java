package twoPoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b15threeSumEqual0 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ds= new ArrayList<>();
        Arrays.sort(nums);
//      nhỏ hơn nums.length -2 là bởi vì ta sẽ lấy số lớn nhất là right r
        for(int a=0;a<nums.length-2;a++){
            // cái này để kiểm tra xem
            if(nums[a]>0){
                break;
            }
            if(nums[a]==nums[a++]){
                continue;
            }
            int left=a+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[a]+nums[left]+nums[right];
                if(sum==0){
                    ds.add(Arrays.asList(nums[a],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1]) left++;
                    while(left<right&&nums[right]==nums[right--]) right--;
                    left++;
                    right--;
                }
                left++;
                right--;
            }

        }


        return ds;
    }

}
