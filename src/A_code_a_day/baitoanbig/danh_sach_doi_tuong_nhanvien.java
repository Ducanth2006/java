package A_code_a_day.baitoanbig;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class employee2 {
    String id;
    String name;
    String gioiTinh;
    String bd;
    String diaChi;
    long idTax;
    String ngayKiHopDong;

    public employee2(String id, String name, String gioiTinh, String bd, String diaChi, long idTax, String ngayKiHopDong) {
        this.id = id;
        this.bd = bd;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.idTax = idTax;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    // bài toán con hay này chuyển về localdate
    public LocalDate getBd() {
        DateTimeFormatter input = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(bd, input);
        return date;
    }

    public String toString() {
        return id + " " + name + " " + gioiTinh + " " + bd + " " + diaChi + " " + idTax + " " + ngayKiHopDong;
    }

    public static String chuaHoaDate(String x) {
        DateTimeFormatter input = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(x, input);
        DateTimeFormatter output = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(output);
    }

    public static String sinhId(int i) {
        return String.format("%05d", i);
    }
}

public class danh_sach_doi_tuong_nhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<employee2> ds = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= test; i++) {
            String id = employee2.sinhId(i);
            String name = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String bd = employee2.chuaHoaDate(sc.nextLine());
            String diaChi = sc.nextLine();
            long idTax = Long.parseLong(sc.nextLine());
            String ngayKyHopDong = employee2.chuaHoaDate(sc.nextLine());
            ds.add(new employee2(id, name, gioiTinh, bd, diaChi, idTax, ngayKyHopDong));
        }
        ds.sort(Comparator.comparing(employee2::getBd));// vậy khi ta có thể tự khai báo kiểu tự lấy giá trị để sắp xếp nhé

        for (employee2 x : ds) {
            System.out.println(x);
        }
    }
}
