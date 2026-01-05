package A_code_a_day.Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class sinhVien7 {
    String msv;
    String name;
    String lop;
    String email;

    public String getLop() {
        return lop;
    }

    public sinhVien7(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }
}

public class LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        ArrayList<sinhVien7> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < test; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            ds.add(new sinhVien7(msv, name, lop, email));
        }
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String lopQ = sc.nextLine();

            List<sinhVien7> dslop = ds.stream().filter(sinhVien7 -> lopQ.equals(sinhVien7.getLop())).collect(Collectors.toList());
            System.out.printf("DANH SACH SINH VIEN LOP %s:", lopQ);
            System.out.println();
            for (sinhVien7 x : dslop) {
                System.out.println(x);
                System.out.println();
            }
        }
    }

}
