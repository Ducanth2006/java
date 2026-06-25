package cau1;

import java.util.Scanner;

public class Backtracking_HoanVi {
    static int N;
    static int[] X;
    static boolean[] used; // Mảng đánh dấu trạng thái đã sử dụng

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                N = sc.nextInt();
                X = new int[N + 1];
                used = new boolean[N + 1]; // Mặc định Java khởi tạo là false
                Try(1);
                System.out.println();
            }
        }
        sc.close();
    }

    static void Try(int i) {
        for (int j = 1; j <= N; j++) {
            if (!used[j]) { // Nếu số j chưa được sử dụng ở các bước trước
                X[i] = j;
                used[j] = true; // Đánh dấu j đã dùng

                if (i == N) {
                    printResult(); // Đã xếp đủ N vị trí
                } else {
                    Try(i + 1); // Đi sâu xuống để xếp vị trí tiếp theo
                }

                used[j] = false; // QUAN TRỌNG: Backtrack (mở khóa) để các nhánh khác dùng lại j
            }
        }
    }

    static void printResult() {
        // Đặt điều kiện lọc hoán vị ở đây (Ví dụ: hai số kề nhau không được là số liên tiếp...)
        for (int k = 1; k <= N; k++) {
            System.out.print(X[k]);
        }
        System.out.print(" ");
    }
}
//input
// 2
//2
//3
// out put
//12 21
//123 132 213 231 312 321