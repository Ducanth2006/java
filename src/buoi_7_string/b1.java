package buoi_7_string;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập UseName ");
        // so sánh 2 object dùng equal dùng "\" string in string \""
        String useName = sc.nextLine();
        System.out.println("Nhập password");
        String passWord = sc.nextLine();
        if (useName.equals("Cr7") && passWord.length() >= 6) {
            System.out.println("Oke");
        } else {
            System.out.println("Not");
        }

    }

}
