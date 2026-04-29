package Arrayandhasing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
//  Cách 2 pro hơn dùng hash set nhé
    public int longestConsecutive2(int[] nums) {
        Set<Integer> set0= new HashSet<>();
        // cho vào hashset để sắp xếp và lọc các code thừa
        for(int i:nums){
            set0.add(i);
        }
        int record=0;
        for(int i:set0){
            int tempLength=0;
            if(!set0.contains(i-1)){
                tempLength=1;
                while(set0.contains(i+tempLength)){
                    tempLength++;
                }
                // thay thế bằng hàm Math.max(tempLenght,record)
                if(tempLength>record){
                    record=tempLength;
                }
            }
        }

        return record;
    }

}
// giải thích luồng của cách 2
// ta cho nó vào một hashset để đồng thời sắp xếp và lọc bỏ các phần tử trùng nhau vì trùng nhau thì duyệt cx sẽ bỏ qua
// cho vào hashset sẽ sắp xếp ngon hơn dùng sort về tốc độ
// tiếp tục ta khởi tạo một biến kỷ lục , sau đó ta duyệt các phần tử trong set , vì đã sắp xếp lên nó theo thứ tự từ
// bé -> lớn , khởi tạo một biến tạm thời để ghi chuỗi  sẽ reset sau khi đi qua mỗi phần tử i
// đứng chặn là thăg if kiểm tra xem i có phải số bắt đầu không , tức trước nó có phần tử nào cách nó 1 đơn vị ko
// để làm j? để giúp nó bỏ qua các i ko phải là số bắt đầu vì tý nữa ở dưới các số ko phải số bắt đầu sẽ
// được duyệt và tính vào length biến tạm thời mất rồi. sau khi đi qua thằng if tức số đó là
// số bắt đầu của một chuỗi ta cộng biến lenght=1 vì số đó là 1 chuỗi có độ dài là 1 , tiếp tục ta kiểm tra
// trong vòng while nếu có số đứng sau tức là ví dụ 1 là số bắt đầu , khi đó nó sẽ kiểm tra 1+1 tức là số 2
// có tồn tại trong set ko nếu có tồn tài cộng length vì 2 là chuỗi liên tục cùa 1 , cứ thế cho đến khi ko thỏa mãn
// ,ta sử dụng một if để so sánh với kỷ lục nếu nó lớn hơn ta cập nhật kỷ lục và chuyển tiếp i với length đc reset=0 và
// i sẽ được tua các các số đã nằm trong 1 chuỗi đã đc update kỷ lục trc đó nhé
