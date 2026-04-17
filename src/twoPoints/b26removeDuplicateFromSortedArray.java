package twoPoints;

public class b26removeDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // hãy nhớ đề bài là duplicate nhé ko 3 số liên tiếp đâu
        int a=0;
        int k=1;
        for(int b=1;b<nums.length;b++){
            if(nums[b]!=nums[a]){
                // ta có thể cộng a nên rồi ms gán cx đc mà đâu phải gán luôn đâu :))
                a++;
                nums[a]=nums[b];
                k++;
            }
        }
        return k;

    }
}
//Con trỏ a (Writer - Người ghi chép): Luôn đứng tại vị trí của phần tử "duy nhất" cuối cùng được xác nhận. Ban đầu, phần tử đầu tiên (index 0) luôn là duy nhất,
// nên a bắt đầu từ 1.Con trỏ b (Explorer - Người thăm dò): Chạy từ đầu đến cuối để tìm số nào "khác" với số mà a đang giữ.