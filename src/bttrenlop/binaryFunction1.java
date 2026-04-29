package bttrenlop;

import java.util.Scanner;

public class binaryFunction1{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            if (sc.hasNextInt()) {
                int t = sc.nextInt(); // Số lượng bộ test
                while (t-- > 0) {
                    if (sc.hasNextInt()) {
                        int n = sc.nextInt();

                        // Xử lý các trường hợp n nhỏ để tránh lỗi index
                        if (n <= 0) {
                            System.out.println(0);
                            continue;
                        }

                        long[] M = new long[Math.max(3, n)];
                        M[0] = 1;
                        M[1] = 2;
                        M[2] = 4;

                        for (int i = 3; i < n; i++) {
                            M[i] = M[i - 1] + M[i - 2] + M[i - 3];
                        }

                        System.out.println(M[n - 1]);
                    }
                }
            }
            sc.close();
        }


}