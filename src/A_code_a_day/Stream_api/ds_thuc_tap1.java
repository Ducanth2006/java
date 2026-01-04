package A_code_a_day.Stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class student4 {
    long stt;
    String id;
    String name;
    String lop;
    String email;
    String doanhNghiep;

    public student4(long stt, String id, String name, String lop, String email, String doanhNghiep) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getId() {
        return id;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    public String toString() {
        return stt + " " + id + " " + name + " " + lop + " " + email + " " + doanhNghiep;
    }
}

public class ds_thuc_tap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student4> ds = new ArrayList<>();
        long test = Long.parseLong(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            long stt = i;
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String doanhNghiep = sc.nextLine();
            ds.add(new student4(stt, id, name, lop, email, doanhNghiep));
        }
        ds.sort(Comparator.comparing(student4::getId));
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= q; i++) {
            String tenDNq = sc.nextLine();
            List<student4> dschuan = ds.stream().filter(dn -> dn.getDoanhNghiep().equals(tenDNq)).collect(java.util.stream.Collectors.toList());
            for (student4 x : dschuan) {
                System.out.println(x);
            }

        }

    }
}
