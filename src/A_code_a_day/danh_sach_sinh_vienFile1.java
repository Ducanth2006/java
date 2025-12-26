package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class sinhVien {
    String msv;
    String name;
    String lop_sv;
    String email;

    sinhVien(String msv, String name, String lop_sv, String email) {
        this.msv = msv;
        this.name = chuanHoaName(name);
        this.lop_sv = lop_sv;
        this.email = email;
    }

    public static String chuanHoaName(String s) {
        String[] mang = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : mang) {
            String wordchuan = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
            sb.append(wordchuan).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop_sv + " " + email;
    }
}

public class danh_sach_sinh_vienFile1 {


    public static void main(String[] args) {
        Set<Integer> treeset = new TreeSet<>();
        File file = new File("file23.txt");
        try {
            Scanner reader = new Scanner(file);
            ArrayList<sinhVien> danhsach = new ArrayList<>();

            if (reader.hasNextLine()) {
                int test = reader.nextInt();
                reader.nextLine();
                for (int i = 1; i <= test; i++) {
                    String msv = reader.nextLine();
                    String fullName = reader.nextLine().toLowerCase().trim();
                    String lop = reader.nextLine();
                    String email = reader.nextLine();
                    // Đọc thành công
                    danhsach.add(new sinhVien(msv, fullName, lop, email));


                }
            }
// rất lạ cần tìm hiểu sâu dưới đây là các bài toán con khá hay lưu í nhé
//            Collections.sort(danhsach, new Comparator<sinhVien>() {
//                @Override
//                public int compare(sinhVien o1, sinhVien o2) {
//                    // So sánh chuỗi MSV (String), không so sánh số cuối
//                    return o1.msv.compareTo(o2.msv);
//                }
//            });
            // đây là sắp xếp sinh viên theo tên , sau đó sắp xếp theo ngày sinh tức tuổi lớn nhất và tên theo từ điển
//            danhsach.sort(Comparator.comparing(sinhVien::getName) //(sinhVien::getName) === (sv -> sv.getName())
//                        .thenComparing(sinhVien::getNgaySinh));// điều kiện ngày sinh phải chuyển về localdate


//             // 2. KẾT HỢP: LỌC SINH VIÊN GIỎI (> 3.2) RỒI NHÓM THEO LỚP
//        Map<String, List<sinhVien>> ketQuaHocBong = danhsach.stream()
//                .filter(sv -> sv.gpa > 3.2)                 // Bước 1: Lọc người giỏi trước
//                .collect(Collectors.groupingBy(sv -> sv.lop_sv)); // Bước 2: Nhóm những người giỏi vào nhóm
//                groupingBy giúp gom nhóm sinh viên theo lơppxs
//
//    List<sinhVien> ketQua = danhsach.stream()
//    // 1. Lọc theo lớp
//    .filter(sv -> sv.lop_sv.equals("D15CQKT02-B"))
//
//    // 2. Sắp xếp theo tên (Thứ tự từ điển A-Z)
//    .sorted(Comparator.comparing(sv -> sv.name))
//
//    // 3. Thu hoạch vào danh sách mới
//    .collect(Collectors.toList());// đây là kiểu thư hoạch
//
// 4. Dùng vòng for của bạn để in ra
//for (sinhVien sv : ketQua) {
//    System.out.println(sv);
//}
//            * **Gán vào biến:** ```java
//long soLuong = danhsach.stream()
//    .filter(sv -> sv.lop_sv.equals("D15"))
//    .count(); // Trả về số lượng người thỏa mãn

            // VIẾT DÒNG NÀY VÀO THAY THẾ
            danhsach.sort(Comparator.comparing(sv -> sv.msv));
            for (sinhVien sv : danhsach) {
                System.out.println(sv);
            }
        } catch (FileNotFoundException e) {

        }

    }
}
