package b2;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là : ");
        int yourchoice = scanner.nextInt();
        switch (yourchoice) {
            case 1:
                System.out.println("bạn đã lựa chọn phép cộng");
                break;
            case 2:
                System.out.println("bạn lựa chọn phép trừ ");
                break;
            default:
                System.out.println("Kết thúc thôi ");
                System.out.println("đã out");
                System.exit(0);


        }
        System.out.println("Chưa out");
    }
}
