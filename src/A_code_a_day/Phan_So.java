package A_code_a_day;

import java.util.Scanner;

public class Phan_So {
    private long tu;
    private long mau;

    public static long gcd(long tu, long mau) {
        while (mau != 0) {
            long r = tu % mau;
            tu = mau;
            mau = r;
        }
        return tu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        long ucl = gcd(tu, mau);
        tu /= ucl;
        mau /= ucl;
        System.out.printf("%d/%d", tu, mau);

    }
}
