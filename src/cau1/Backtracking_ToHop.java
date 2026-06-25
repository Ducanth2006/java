package cau1;

import java.util.Scanner;

public class Backtracking_ToHop {
    static int N, K;
    static int[] X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                N = sc.nextInt();
                K = sc.nextInt();
                X = new int[K + 1];
                X[0] = 0; // Điểm tựa để vị trí i=1 chạy từ X[0] + 1 = 1
                Try(1);
                System.out.println();
            }
        }
        sc.close();
    }

    static void Try(int i) {
        // j chạy từ (giá trị trước + 1) đến giới hạn tối đa có thể chọn
        for (int j = X[i - 1] + 1; j <= N - K + i; j++) {
            X[i] = j;
            if (i == K) {
                printResult(); // Đã chọn đủ K phần tử
            } else {
                Try(i + 1);
            }
        }
    }

    static void printResult() {
        // Đặt điều kiện lọc cấu hình tổ hợp ở đây nếu đề bài yêu cầu
        for (int m = 1; m <= K; m++) {
            System.out.print(X[m] + "");
        }
        System.out.print(" ");
    }
}
//input
//2
//4 2
//5 3
// out put
//12 13 14 23 24 34
//123 124 125 134 135 145 234 235 245 345