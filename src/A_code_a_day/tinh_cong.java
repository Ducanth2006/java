package A_code_a_day;

import java.util.Scanner;

class employee {
    String id, name;
    long luongThang, thuong, phuCap, thuNhap; // Chuyển hết sang long

    public employee(String id, String name, long luongThang, long thuong, long phuCap, long thuNhap) {
        this.id = id;
        this.name = name;
        this.luongThang = luongThang;
        this.thuong = thuong;
        this.phuCap = phuCap;
        this.thuNhap = thuNhap;
    }

    @Override
    public String toString() {
        // In ra các số nguyên, không có đuôi .0
        return id + " " + name + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
    }

    public static long tinhThuong(long luongCoBan, int soNgayCong) {
        long luong = luongCoBan * soNgayCong;
        if (soNgayCong >= 25) return luong / 5;   // 20%
        if (soNgayCong >= 22) return luong / 10;  // 10%
        return 0;
    }

    public static long tinhPhuCap(String level) {
        if (level.equals("GD")) return 250000;
        if (level.equals("PGD")) return 200000;
        if (level.equals("TP")) return 180000;
        return 150000; // Mặc định là NV
    }
}
public class tinh_cong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String id="NV01";
        String name=sc.nextLine();
        long luongCoBan=sc.nextLong();
        int soNgayCong=sc.nextInt();
        String level=sc.next();
        long luongThang=luongCoBan*soNgayCong;
        long thuong=employee.tinhThuong(luongCoBan,soNgayCong);
        long phuCap=employee.tinhPhuCap(level);
        long thuNhap=luongThang+thuong+phuCap;
        employee e1=new employee(id,name,luongThang,thuong,phuCap,thuNhap);
        System.out.println(e1);
    }
}
