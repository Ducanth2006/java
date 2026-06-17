package cau1;

import java.util.Scanner;

public class Backtracking_NhiPhan {
    static int N;
    static int[] X; // Mảng lưu cấu hình hiện tại

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt(); // Nhập số bộ test
            while (T-- > 0) {
                N = sc.nextInt();
                X = new int[N + 1]; // Khởi tạo từ 1 đến N
                Try(1);
                System.out.println(); // Hết một test case thì xuống dòng
            }
        }
        sc.close();
    }

    // Thử các giá trị cho vị trí i
    static void Try(int i) {
        for (int j = 0; j <= 1; j++) { // Chuỗi nhị phân chỉ chọn 0 hoặc 1
            X[i] = j;
            if (i == N) {
                printResult(); // Đạt đến đích -> Kiểm tra và in
            } else {
                Try(i + 1); // Tiếp tục thử vị trí tiếp theo
            }
        }
    }

    static void printResult() {
        // CHIẾN THUẬT: Bạn có thể thêm điều kiện lọc ở đây bằng lệnh IF
        // Ví dụ: chỉ in chuỗi có nhiều hơn 2 số 1, tổng bằng K, v.v.
        for (int k = 1; k <= N; k++) {
            System.out.print(X[k]);
        }
        System.out.print(" ");
    }
}
