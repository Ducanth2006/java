package A_code_a_day;

import java.util.Scanner;

public class tong_phan_so {
    long tu;
    long mau;

    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long a1 = sc.nextLong();
        long b = sc.nextLong();
        long b1 = sc.nextLong();
        long quydongtu = a * b1 + (a1 * b);
        long quydongmau = a1 * b1;
        long tu = quydongtu / gcd(quydongtu, quydongmau);
        long mau = quydongmau / gcd(quydongtu, quydongmau);

        System.out.printf("%d/%d", tu, mau);

    }
}
