package A_code_a_day;

import java.util.Scanner;

//Interchange Sort
public class sap_xep_cho_doi_truc_tiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
//                    int temp = 0;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.printf("Buoc %d:", i + 1);
            for (int x : a) {
                System.out.print(" " + x);
            }
            System.out.println();
        }
    }

}
// mã giải
// thuật toán quan trọng nhất trong này đó chính là đoạn interchange sort
//nó dùng 2 thằng for lồng nhau thằng đầu tiên là index i = 0(i <n-1) tại vì thằng j =i+1
// thằng for 2 bắt đầu bằng j= i+1  (j<n)
// ta chạy tìm điều kiện sao cho tìm được số j đầu tiên từ trái sang lớn hơn giá trị i duyệt từ trái sang
// nếu thỏa mãn đảo 2 vị trí đó cho nhau , sau đó từ vị trí i(a[i] lúc này đã đổi thành a[j] tiếp tục tìm vị trí j
// và đảo sao cho đến khi không còn giá trị nào thỏa mãn điều kiện ==> print ra

