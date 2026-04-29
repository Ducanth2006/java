package bttrenlop;
import java.util.Scanner;
public class SinhBinary {
    // Hàm xử lý tìm xâu nhị phân kế tiếp
    public static void sinhNhiPhanKếTiếp(char[] a) {
        int n = a.length;
        int i = n - 1;

        // Bước 1: Tìm vị trí số 0 đầu tiên tính từ phải sang trái
        while (i >= 0 && a[i] == '1') {
            i--;
        }

        // Bước 2: Nếu i < 0, nghĩa là xâu toàn 1 (ví dụ 111)
        if (i < 0) {
            // Theo yêu cầu, xâu kế tiếp của 111... là 000...
            for (int j = 0; j < n; j++) {
                a[j] = '0';
            }
        } else {
            // Bước 3: Đổi số 0 tại vị trí i thành 1
            a[i] = '1';
            // Bước 4: Chuyển tất cả các vị trí sau i thành 0
            for (int j = i + 1; j < n; j++) {
                a[j] = '0';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng bộ test T
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                // Đọc xâu nhị phân X
                String s = sc.next();
                char[] mang = s.toCharArray();

                // Gọi hàm sinh kế tiếp
                sinhNhiPhanKếTiếp(mang);

                // In kết quả
                System.out.println(String.valueOf(mang));
            }
        }
        sc.close();
    }
}