package failure.Review;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class b18Threesum0 {
    public List<List<Integer>> threeSum0(int[] nums) {
        List<List<Integer>> ds=new ArrayList<>();
        // Tý quên short
        Arrays.sort(nums);
        // ta tính theo a+b+c=0 , a<b<c
        for(int a=0;a<nums.length-2;a++){
            if(nums[a]>0) break; // vì a nhỏ nhất khi a nhỏ nhất mà >0 suy ra break luôn đi
            // Kiểm tra xem số sau a có =a ko nếu bằng => skip
            if(a>0&&nums[a-1]==nums[a]){
                continue;
            }
            // 2 con trỏ đó đây dùng để duyệt toàn bộ nhé , duyệt từ trái sang
            int b=a+1;
            int c=nums.length-1;
            while(b<c){
                int sum=nums[a]+nums[b]+nums[c];
                if(sum==0){
                    ds.add(Arrays.asList(nums[a],nums[b],nums[c]));
                    while(b<c&&nums[b]==nums[b+1]) b++;
                    while(b<c&&nums[c]==nums[c-1]) c--;
                    b++;
                    c--;
                }
                else if(sum<0) b++;
                else c--;

            }
        }
        return ds;

    }
}
