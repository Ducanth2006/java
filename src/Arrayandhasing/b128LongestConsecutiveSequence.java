package Arrayandhasing;

import java.util.Arrays;

public class b128LongestConsecutiveSequence {
    public  int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int tempRes=1;
        int finalRes=1;
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] - nums[i - 1] == 1) {
                    tempRes += 1;
                }
//              Kiểm tra kỷ lục nếu bị dừng consecutive
                else {
                    if (tempRes > finalRes) {
                        finalRes = tempRes;
                        // biết tại sao để đây gây lỗi ko thứ nhất khi nó chạy đến chuỗi mà có số các chuỗi
                        // liên tiếp bằng nhau thì nó sẽ tiếp tục cộng thay vì reset lại để cộng tiếp
//                      tempRes = 1;
                    }
                    tempRes=1;
                    // lý do phải để nó ra là vì khi hết liên tục phải reset lại tempRes dù thế nào đi chăng nữa
                }
            }


        }
// phải để thằng này ở ngoài để kiểm tra kết quả cuối cùng nhé vì khi chạy đến cuối cùng
// thì nó sẽ ko chạy vào vào kiểm tra kỷ lục khi dừng kia để ghi cho mình lần duyệt  final đâu nhé
        if(tempRes>finalRes){
            finalRes=tempRes;
        }
        return finalRes;
    }


}
