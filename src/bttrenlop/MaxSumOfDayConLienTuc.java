package bttrenlop;

public class MaxSumOfDayConLienTuc {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 7};
        int n = arr.length;

        int result = 0;

        for (int i = 0; i < n; i++) {
            int currentMax = arr[i];

            for (int j = i; j < n; j++) {
                currentMax = Math.max(currentMax, arr[j]);
                result += currentMax;
            }
        }

        System.out.println(result); // 42
    }
}
// cách giải này hướng ta đến cách giải quyết kiểu đi sâu vào ko cần định hình ra à nó phải chạy 1,3,1 ấy
// mà nó chỉ cần so sánh cái max và lấy chính max để cộng ấy ví dụ đáng lẽ theo tư duy nó phải sinh ra và định hình một
// arr có 1,3,1 ấy nhưng ko nó lấy 1 ở index(0) so sánh với 3 ở index(1) lấy max thành 3 ,rồi ta đem 3 đi so sánh với 1 index(2)
// rồi vẫn lấy 3 tiếp tục để cộng cứ như vậy là nó đã so sánh xong bước 1 (1,3)(1,3,1) rồi nhé tổng bằng 7 chứ