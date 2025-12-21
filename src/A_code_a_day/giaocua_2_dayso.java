package A_code_a_day;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class giaocua_2_dayso {
    public static ArrayList<Long> check(ArrayList<Long> aN, ArrayList<Long> bN) {
        HashSet<Long> setB = new HashSet<>(bN);// dùng hashset để tăng tốc độ của contains
        TreeSet<Long> giaoNhau = new TreeSet<>();// dùng thằng này để giúp sắp xếp lại theo thứ tự tăng dần
        for (Long x : aN) {
            if (setB.contains(x)) {
                giaoNhau.add(x);
            }
        }
        return new ArrayList<>(giaoNhau);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        ArrayList<Long> aN = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            aN.add(sc.nextLong());
        }
        ArrayList<Long> bN = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            bN.add(sc.nextLong());
        }
        ArrayList<Long> ketQua = check(aN, bN);
        for (Long x : ketQua) {
            System.out.print(x + " ");
        }

    }
}


