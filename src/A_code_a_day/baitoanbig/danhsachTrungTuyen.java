package A_code_a_day.baitoanbig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class student1 {
    String id;
    String name;
    double toan;
    double ly;
    double hoa;
    double diemUuTien;
    double tongDiem;
    String ketQua;

    // chuan hoa ten ,  cong diem , quet kv , xet pass or not , sort diem giam dan then msv tu dien
    // lay diem chuan cao nhat dua tren tieu chi
    // start constructor va get va toString
    public double getTongDiem() {
        return tongDiem;
    }

    public String getId() {
        return id;
    }

    public student1(String id, String name, double diemUuTien, double tongDiem) {
        this.id = id;
        this.name = name;
        this.diemUuTien = diemUuTien;
        this.tongDiem = tongDiem;


    }

    @Override
    public String toString() {
        return id + " " + name + " " + formatDouble(diemUuTien) + " " + formatDouble(tongDiem) + " ";
    }
    // end  constructor va get va toString

    //chuan hoa name
    public static String chuanHoaName(String x) {
        String[] xau = x.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String i : xau) {
            String wordChuan = i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }

    // quetKv
    public static double quetKv(String id) {
        String kv = id.substring(0, 3);
        double diemUuTien = 0;
        if (kv.equals("KV1")) {
            return diemUuTien = 0.5;
        } else if (kv.equals("KV2")) {
            return diemUuTien = 1;
        } else {
            return diemUuTien = 2.5;
        }
    }

    // tinh tong hàm mới cần học này
    public static double tongDiem(double toan, double ly, double hoa, double diemUuTien) {
        return toan * 2 + ly + hoa + diemUuTien;
    }

    // tim diem chuan Ham mới
    public static double xacDinhDiemChuan(ArrayList<student1> candidates, int chiTieu) {
        // Kiểm tra nếu danh sách trống hoặc chỉ tiêu không hợp lệ
        if (candidates == null || candidates.isEmpty() || chiTieu <= 0) {
            return 0.0;
        }
        return candidates.stream()
                // 1. Sắp xếp đối tượng theo điểm giảm dần
                .sorted(Comparator.comparingDouble(student1::getTongDiem).reversed())
                // 2. Nhảy đến vị trí người cuối cùng của chỉ tiêu
                .skip(chiTieu - 1)
                // 3. Tóm lấy người đó (đối với findFirst, đây là người đầu tiên nó thấy sau khi skip)
                .findFirst()// thằng này kiểu như để dùng ấy
                // 4. Lấy riêng con số điểm từ đối tượng người đó
                .map(student1::getTongDiem)
                // 5. Nếu không tìm thấy (ví dụ chỉ tiêu 10 nhưng chỉ có 5 người) thì trả về 0.0
                .orElse(0.0);
    }

    // xet pass or no
    public static String xetKetQua(double diemChuan, double tongDiem) {
        String x = "";
        if (diemChuan <= tongDiem) {
            return x = "TRUNG TUYEN";
        } else {
            return x = "TRUOT";
        }
    }

    // hàm lấy thì lấy ko thì ko
    public static String formatDouble(double d) {
        if (d == (long) d) // Nếu là số nguyên
            return String.format("%d", (long) d);
        else
            return String.format("%.1f", d);
    }

}

public class danhsachTrungTuyen {
    public static void main(String[] args) {
        ArrayList<student1> ds = new ArrayList<>();

        try {
            Scanner reader = new Scanner(new File("file23.txt"));
            int test = reader.nextInt();
            reader.nextLine();
            for (int i = 0; i < test; i++) {
                String id = reader.nextLine();
                String name = student1.chuanHoaName(reader.nextLine());// xong chuan hoa ten
                double toan = Double.parseDouble(reader.nextLine());
                double ly = Double.parseDouble(reader.nextLine());
                double hoa = Double.parseDouble(reader.nextLine());
                double diemUuTien = student1.quetKv(id);//xong diem uu tien
                double tongDiem = student1.tongDiem(toan, ly, hoa, diemUuTien);
                ds.add(new student1(id, name, diemUuTien, tongDiem));

//              ds.add(new student1(id,name,))
            }
            int chiTieu = Integer.parseInt(reader.nextLine());
            double diemChuan = student1.xacDinhDiemChuan(ds, chiTieu);
            ds.sort(Comparator.comparing(student1::getTongDiem).reversed().thenComparing(student1::getId));
            System.out.printf("%.1f", diemChuan);
            System.out.println();
            for (student1 x : ds) {
                System.out.println(x + student1.xetKetQua(diemChuan, x.tongDiem));
            }

        } catch (FileNotFoundException e) {

        }
    }
}
