package A_code_a_day;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dem_So_Lan_xuat_hien {
    public static void check(int[] a, int n) {
        //A(key(int),value(int),key là số đó=a[i] , value là số lần xuất hiện =get(a[i))
        Map<Integer, Integer> A = new HashMap<>();// dùng hashmap để tối ưu cho get(key) return ra value
        // for đầu tiên là để tìm ra số này xuất hiện bao lần trong dãy
        for (int i = 0; i < n; i++) {
            // value =A.get(a[i]) nếu số lần xuất hiên (value) là null tức rỗng
            // get(key)=value
            if (A.get(a[i]) == null) {
                A.put(a[i], 1);// thì ta sẽ thêm số đó và số lần xuất hiện là 1
            } else {
                A.put(a[i], A.get(a[i]) + 1);// nếu xuất hiện rồi cộng thêm một
            }
        }
        // for thứ 2 có tác dụng là kiểm tra xem các số đã đc ghi ở vòng for 1 rồi in ra
        for (int i = 0; i < n; i++) {
            if (A.get(a[i]) > 0) {
                System.out.printf("%d xuat hien %d lan\n", a[i], A.get(a[i]));
                A.put(a[i], 0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int j = 0; j < test; j++) {
            System.out.printf("Test %d:\n", j + 1);
            int n = sc.nextInt();
            // đoạn này hay này tạo một list rồi thêm vào theo list đó
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            check(a, n);
        }
    }
}
