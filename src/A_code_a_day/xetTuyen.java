package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

// Chú ý nếu tổng lớn hơn 10 thì vẫn chỉ là 10,Họ tên - có thể chưa được chuẩn hóa,Ngày sinh (có thể chưa đúng định dạng dd/mm/yyyy)
//Mã thi tuyển (bắt đầu từ PH01),Tuổi 2021-, Điểm trung bình (đã tính cả điểm thưởng và làm tròn)
class candidates1 {
    String id;
    String name;
    String bd;
    int age;
    double diemLyThuyet;
    double diemThucHanh;
    double diemThuong;
    int diemTb;
    String xepLoai;

    public candidates1(int id, String name, String bd, double diemLyThuyet, double diemThucHanh) {
        this.id = sinhId(id);
        this.name = chuanHoaName(name);
        this.bd = chuanHoaNgay(bd);
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        double diemThuong = tinhDiemThuong(diemThucHanh, diemLyThuyet);
        this.age = tinhAge(this.bd);
        this.diemTb = tinhTong(diemLyThuyet, diemThucHanh, diemThuong);
        this.xepLoai = tinhxepLoai(this.diemTb);
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

    private String chuanHoaNgay(String bd) {
        DateTimeFormatter input = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(bd, input);
        DateTimeFormatter output = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(output);

    }

    private double tinhDiemThuong(double diemThucHanh, double diemLyThuyet) {
        double diemThuong = 0;
        if (diemLyThuyet >= 8 && diemThucHanh >= 8) {
            diemThuong = 1;
        } else if ((diemLyThuyet >= 7.5 && diemLyThuyet < 8) && (diemThucHanh >= 7.5 && diemThucHanh < 8)) {
            diemThuong = 0.5;
        } else {
            diemThuong = 0;
        }
        return diemThuong;
    }

    private int tinhAge(String bd) {
        int x = Integer.valueOf(bd.substring(6));
        return 2021 - x;
    }

    private int tinhTong(double diemLyThuyet, double diemTh, double diemThuong) {
        long diemTong = Math.round(((diemLyThuyet + diemTh) / 2) + diemThuong);
        if (diemTong > 10) {
            return 10;
        } else {
            return (int) diemTong;
        }
    }

    private String tinhxepLoai(int diem) {
        String ketQua = "";

        if (diem < 5) {
            ketQua = "Truot";
        } else if (diem <= 6) {
            // Trường hợp này bao gồm điểm 5 và điểm 6
            ketQua = "Trung binh";
        } else if (diem == 7) {
            ketQua = "Kha";
        } else if (diem == 8) {
            ketQua = "Gioi";
        } else {
            // Trường hợp còn lại là điểm 9 hoặc 10
            ketQua = "Xuat sac";
        }

        return ketQua;
    }

    private String sinhId(int i) {
        return String.format("PH%02d", i);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + diemTb + " " + xepLoai;
    }


}

public class xetTuyen {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(new File("file23.txt"));
            ArrayList<candidates1> ds = new ArrayList<>();
            int test = reader.nextInt();
            reader.nextLine();
            for (int i = 1; i <= test; i++) {
                int id = i;
                String name = reader.nextLine();
                String bd = reader.nextLine();
                double diemLt = Double.parseDouble(reader.nextLine());
                double diemTh = Double.parseDouble(reader.nextLine());
                ds.add(new candidates1(id, name, bd, diemLt, diemTh));
            }
            for (candidates1 x : ds) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {

        }
    }
}
