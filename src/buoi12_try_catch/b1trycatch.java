package buoi12_try_catch;

import java.util.Scanner;

public class b1trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ame) {
            System.out.println("lỗi do b =0 ");

        } finally {
            System.out.println("tao đã kết thúc ");
        }
    }
}
