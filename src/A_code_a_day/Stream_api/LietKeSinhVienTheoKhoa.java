package A_code_a_day.Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class sinhVien8 {
    String msv;
    String name;
    String lop;
    String email;

    public String getMsv() {
        return msv;
    }

    public sinhVien8(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }

}

public class LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien8> ds = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < test; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            ds.add(new sinhVien8(msv, name, lop, email));
        }
        // dùng cái arrow này có thể giúp lọc theo chuỗi đã cắt ấy vân chung một khóa như cắt bớp bỏ thông tin khóa
        Map<String, List<sinhVien8>> mapLop = ds.stream().collect(Collectors.groupingBy(sv -> sv.getMsv().substring(0, 3)));
//        int q = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < q; i++) {
//            String nam = sc.nextLine();
//            String Khoa = "B" + nam.substring(2, 4);
//            System.out.printf("DANH SACH SINH VIEN KHOA %s:", nam);
//            System.out.println();
//
//            List<sinhVien8> thoaMan = mapLop.get(Khoa);
//            List<sinhVien8> thoaMan = mapLop.getOrDefault(Khoa, new ArrayList<>());
//            for (sinhVien8 x : thoaMan) {
//                System.out.println(x);
//
//            }
//
//        }
        int q = sc.nextInt(); // Đọc số lượng câu hỏi
        for (int i = 0; i < q; i++) {
            String nam = sc.next(); // Dùng next() thay vì nextLine() để an toàn
            String Khoa = "B" + nam.substring(2, 4);

            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", nam);
            List<sinhVien8> thoaMan = mapLop.getOrDefault(Khoa, new ArrayList<>());
            for (sinhVien8 x : thoaMan) {
                System.out.println(x);
            }
        }
    }
}
