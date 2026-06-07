package CodePtit;

import java.util.Scanner;

public class xauNhiPhanCoKBit1 {

    static int[] a;
    private static boolean checkCondition(int k,int []mang){
        int count=0;
        for(int i=0;i<mang.length;i++){
            if(mang[i]==1){
                count++;
            }
        }
        if(count==k){
            return true;
        }
        return false;
    }
    private static void sinh(int i, int count,int n,int k) {
        for (int j = 0; j <= 1; j++) {
            a[i] = j;
            int nextCount = (j == 1) ? count + 1 : count;

            if (i == n - 1) {
                if (nextCount == k) {
                    for(int q=0;q<n;q++){
                        System.out.print(q);
                    }
                    System.out.println();
                    // In kết quả
                }
            } else {
                // Có thể thêm điều kiện cắt tỉa ở đây:
                // Nếu nextCount <= k, mới gọi đệ quy tiếp
                sinh(i + 1, nextCount,n,k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            a = new int[n];
            int k=sc.nextInt();
            sinh(0,k,n,k);

        }
    }
}
