package CodePtit;

import java.util.*;

public class demSoVatCan {
    static int row, col;
    static char[][] matrix;

    // Đây là hàm "Lau dọn" (DFS)
    public static void dfs(int r, int c) {
        // 1. Điều kiện dừng: Nếu đi ra ngoài bản đồ hoặc gặp ô trống (.) thì quay về
        if (r < 0 || r >= row || c < 0 || c >= col || matrix[r][c] == '.') {
            return;
        }

        // 2. Đánh dấu đã lau dọn: Biến # thành .
        matrix[r][c] = '.';

        // 3. Đệ quy: Đi sang 4 hướng xung quanh để lau tiếp
        dfs(r + 1, c); // Xuống dưới
        dfs(r - 1, c); // Lên trên
        dfs(r, c + 1); // Sang phải
        dfs(r, c - 1); // Sang trái
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        row = sc.nextInt();
        col = sc.nextInt();
        matrix = new char[row][col];

        // Bước 1: Nhập dữ liệu vào ma trận
        for (int i = 0; i < row; i++) {
            String line = sc.next();
            for (int j = 0; j < col; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        int sum = 0;

        // Bước 2: Duyệt từng ô
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Nếu thấy vật cản (#)
                if (matrix[i][j] == '#') {
                    sum++;      // Đã tìm thấy 1 vật cản mới
                    dfs(i, j);  // Gọi hàm lau sạch toàn bộ vật cản liên thông này
                }
            }
        }

        System.out.println(sum);
    }
}