package Arrayandhasing;

import java.util.HashMap;
import java.util.Map;

public class majorityEv2 {
    public int dealmajorityEv2(int [] nums){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        };
        int record=0;
        int res=0;
        // Cần học thuộc cú pháp này nó important
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>record){
                record=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;
    }
}
// ta có thể dùng n=nums.length/2 vì nếu nó là majority thì nó luôn ở giữa thử lấy ví dụ xem
// Một phần tử được gọi là Majority Element nếu nó xuất hiện nhiều hơn
// lần. hehe cẩn thận nhé định nghĩa đó thì thật sự số ở giữa sẽ là mảng(sorted) chia đôi rồi
// Đọc kỹ đầu bài vô rồi hãng làm nhé