package Arrayandhasing;



class solutionB27{
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }
}
public class b27_remove_element {
}
// code giải
// bài này ta có tư duy là sử dụng 1 biến đếm với giá trị bắt đầu là k=0
// , vào vòng for ta kiểm tra xem nó khác val ko nếu khác ta đảo nó lên đầu mảng với nums[k]=nums[i]
// sử dụng k++ để tăng biến trong vòng lặp
// bài này tôi đã tư duy quá phức tạp vấn đề mà ko nghĩ đến cách đơn giản , tôi đã nghĩ đến
// hash map thay vì sử dụng 1 vòng for là xong bài này rồi ,với cả cách hiểu đề bài sai bài này chỉ cần
// đảo các vị trí khác val lên đầu và giữ nguyên or override các vị trí giống val ở cuối và trả về biến k với k là
//số lượng các giá trị khác val trong mảng
