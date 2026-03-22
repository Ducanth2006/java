package bttrenlop;

public class dayConHasMaxSum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, -3, 6, 3, -5, 2, 2};
        int n = arr.length;
        int u = 1, v = 2;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];
                int len = j - i + 1;

                if (len >= u && len <= v) {
                    maxSum = Math.max(maxSum, sum);
                }

                if (len > v) break; // tối ưu nhẹ
            }
        }

        System.out.println(maxSum); // 9
    }

}
