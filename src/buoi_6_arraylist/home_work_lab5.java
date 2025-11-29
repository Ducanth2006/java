package buoi_6_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class home_work_lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();//dùng dimond generic
        while (true) {
            list.add(sc.nextDouble());
            sc.nextLine();//Nhập chuỗi sau nhập số: Luôn nhớ thêm một dòng sc.nextLine() để "hứng" dấu Enter thừa.
            System.out.println("do you want add more ? Y/N");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("N")) {
                break;

            }
        }
        double s = 0;
        for (double i : list) {
            s += i;
        }
        System.out.println("tổng là " + s);
        System.out.println(list);
    }
}
