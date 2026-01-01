package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//Điểm luyện tập: chiếm 25%
//Điểm thực hành online: chiếm 35%
//Điểm thi: chiếm 40%
//Họ tên: có thể chưa được chuẩn hóa, sắp xếp theo điểm tổng kết từ cao xuống thấp,sinh tính từ SV01
// ,Điểm tổng kết với đúng 2 số phần thập phân
class sinhVien2 {
    String id;
    String name;
    int diemLt;
    int diemTH;
    int diemThi;
    double tongDiem;
    String xepLoai;

    public sinhVien2(int id, String name, int diemLt, int diemTH, int diemThi) {
        this.id = sinhId(id);
        this.name = chuanHoaName(name);
        this.diemLt = diemLt;
        this.diemTH = diemTH;
        this.diemThi = diemThi;
        this.tongDiem = tinhTong(diemLt, diemTH, diemThi);
        this.xepLoai = tinhLoai(this.tongDiem);
    }

    public double getTongDiem() {
        return tongDiem;
    }

    private String chuanHoaName(String x) {
        String[] tho = x.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String k : tho) {
            String wordChuan = k.substring(0, 1).toUpperCase() + k.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }

    private String tinhLoai(double d) {
        String loai = "";
        if (d >= 8) {
            loai = "GIOI";
        } else if (d < 8 && d >= 6.5) {
            loai = "KHA";
        } else if (d < 6.5 && d >= 5) {
            loai = "TRUNG BINH";
        } else {
            loai = "KEM";
        }
        return loai;
    }

    private String sinhId(int i) {
        return String.format("SV%02d", i);
    }

    private double tinhTong(int diemLt, int diemTH, int diemThi) {
        return (diemLt * 0.25) + (diemTH * 0.35) + (diemThi * 0.4);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", tongDiem) + " " + xepLoai;
    }

}

public class Xep_Loai {
    public static void main(String[] args) {
        try {
            ArrayList<sinhVien2> ds = new ArrayList<>();
            Scanner reader = new Scanner(new File("file23.txt"));
            int test = reader.nextInt();
            reader.nextLine();
            for (int i = 1; i <= test; i++) {
                int id = i;
                String name = reader.nextLine();
                int diemLt = Integer.parseInt(reader.nextLine());
                int diemTH = Integer.parseInt(reader.nextLine());
                int diemThi = Integer.parseInt(reader.nextLine());
                ds.add(new sinhVien2(id, name, diemLt, diemTH, diemThi));
            }
            ds.sort(Comparator.comparing(sinhVien2::getTongDiem).reversed());
            for (sinhVien2 x : ds) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {

        }
    }
}
