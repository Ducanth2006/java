package A_code_a_day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class product2 {
    String id;
    String name;
    String donViTinh;
    long donGiaNhap;
    long soLuong;
    long phiShip;
    double thanhTien;
    double giaBan;

    public product2(int id, String name, String donViTinh, long donGiaNhap, long soLuong) {
        this.id = sinhId(id);
        this.name = name;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
        this.phiShip = Math.round((donGiaNhap * soLuong) * 0.05);
        // Thành tiền là tổng của 2 số long đã chuẩn, không cần double ở đây
        long tongThanhTien = (donGiaNhap * soLuong) + this.phiShip;
        this.thanhTien = (double) tongThanhTien;

        // QUAN TRỌNG: Làm tròn giá bán trước khi lưu
        this.giaBan = lamTronDen100(Math.round((tongThanhTien + Math.round(tongThanhTien * 0.02)) / soLuong));
    }

    private String sinhId(int i) {
        return String.format("MH%02d", i);
    }

    public String toString() {
        return id + " " + name + " " + donViTinh + " " + phiShip + " " + epSangThu(thanhTien) + " " + epSangThu(giaBan);
    }

    private long epSangThu(double x) {
        return (long) x;
    }

    public double getGiaBanLe() {
        return giaBan;
    }

    private double lamTronDen100(double x) {
        return Math.ceil(x / 100) * 100;
    }

}

public class Tinh_gia_ban1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<product2> ds = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            int id = i;
            String name = sc.nextLine();
            String dv = sc.nextLine();
            Long donGiaNhap = Long.parseLong(sc.nextLine());
            Long soLuong = Long.parseLong(sc.nextLine());
            ds.add(new product2(id, name, dv, donGiaNhap, soLuong));
        }
        ds.sort(Comparator.comparing(product2::getGiaBanLe).reversed());

        for (product2 x : ds) {
            System.out.println(x);
        }
    }
}
