package OnTuBtSinh.nhiPhan;

public class BinaryMoreOnes {
    static int n = 4; // Ví dụ với n = 4
    static int[] X = new int[n + 1];

    static void backtrack(int i, int count1, int count0) {
        for (int j = 0; j <= 1; j++) {
            // Cắt nhánh: Nếu định chọn bit 0 nhưng số bit 0 đã bằng hoặc vượt số bit 1
            if (j == 0 && count0 + 1 > count1) {
                continue;
            }

            X[i] = j;

            // Tính toán số lượng bit mới cho tầng đệ quy sau
            int nextCount1 = (j == 1) ? count1 + 1 : count1;
            int nextCount0 = (j == 0) ? count0 + 1 : count0;

            if (i == n) {
                printArray();
            } else {
                backtrack(i + 1, nextCount1, nextCount0);
            }
        }
    }

    static void printArray() {
        for (int i = 1; i <= n; i++) System.out.print(X[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Kết quả với n = 4:");
        backtrack(1, 0, 0);
    }
}
