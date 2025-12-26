package A_code_a_day.Stream_api;

import java.util.*;
import java.util.stream.Collectors;

// --- CLASS ĐỐI TƯỢNG (POJO) ---
// Lưu ý: Trong 1 file .java chỉ được có 1 class public trùng tên file.
// Class SinhVien này bỏ từ khóa 'public' để nằm chung file được.
class SinhVien {
    private final String maSV;
    private final String hoTen;
    private final String lop;
    private final double gpa;

    public SinhVien(String maSV, String hoTen, String lop, double gpa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
    }

    // Getter (cần thiết cho Stream truy cập dữ liệu)
    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return maSV + " | " + hoTen + " | " + lop + " | " + gpa;
    }
}

// --- CLASS CHÍNH ĐỂ CHẠY ---
public class Main {
    public static void main(String[] args) {
        // 1. KHỞI TẠO DỮ LIỆU MẪU
        List<SinhVien> ds = Arrays.asList(
                new SinhVien("SV1", "Nguyen Van A", "CNTT1", 3.2),
                new SinhVien("SV2", "Tran Thi B", "CNTT2", 3.8), // Giỏi nhất
                new SinhVien("SV3", "Le Van C", "CNTT1", 2.5),
                new SinhVien("SV4", "Pham Thi D", "CNTT2", 3.0),
                new SinhVien("SV5", "Hoang Van E", "DTVT1", 3.5)
        );

        System.out.println("=== 1. LỌC VÀ LẤY DANH SÁCH TÊN (FILTER + MAP) ===");
        // Bài toán: Tìm sinh viên GPA >= 3.0 và chỉ lấy tên của họ
        List<String> dsTenGioi = ds.stream()
                .filter(sv -> sv.getGpa() >= 3.0)   // Giữ lại người >= 3.0
                .map(SinhVien::getHoTen)            // Biến đổi: SinhVien -> String (Tên)
                .collect(Collectors.toList());      // Gom lại thành List

        System.out.println("Danh sách tên SV khá/giỏi: " + dsTenGioi);


        System.out.println("\n=== 2. SẮP XẾP DANH SÁCH (SORTED) ===");
        // Bài toán: Sắp xếp giảm dần theo điểm (GPA cao lên đầu)
        List<SinhVien> dsXepHang = ds.stream()
                .sorted(Comparator.comparingDouble(SinhVien::getGpa).reversed())
                .collect(Collectors.toList());

        dsXepHang.forEach(System.out::println);


        System.out.println("\n=== 3. THỐNG KÊ SỐ LƯỢNG THEO LỚP (GROUPING BY + COUNTING) ===");
        // Bài toán: Mỗi lớp có bao nhiêu sinh viên?
        // Trả về Map<Key=Tên Lớp, Value=Số lượng (Long)>
        Map<String, Long> thongKeLop = ds.stream()
                .collect(Collectors.groupingBy(
                        SinhVien::getLop,       // Key là Lớp
                        Collectors.counting()   // Value là đếm số lượng (thay vì lấy danh sách)
                ));

        thongKeLop.forEach((lop, soLuong) ->
                System.out.println("Lớp " + lop + ": " + soLuong + " sinh viên")
        );


        System.out.println("\n=== 4. TÍNH ĐIỂM TRUNG BÌNH THEO LỚP (AVERAGING) ===");
        // Bài toán: Điểm trung bình của từng lớp là bao nhiêu?
        Map<String, Double> diemTBLop = ds.stream()
                .collect(Collectors.groupingBy(
                        SinhVien::getLop,
                        Collectors.averagingDouble(SinhVien::getGpa) // Tính trung bình cột GPA
                ));

        System.out.println("Điểm TB các lớp: " + diemTBLop);


        System.out.println("\n=== 5. TÌM THỦ KHOA (MAX) ===");
        // Bài toán: Tìm sinh viên có điểm cao nhất
        Optional<SinhVien> thuKhoa = ds.stream()
                .max(Comparator.comparingDouble(SinhVien::getGpa));

        // ifPresent: Nếu tìm thấy thì in ra (tránh lỗi nếu danh sách rỗng)
        thuKhoa.ifPresent(sv -> System.out.println("Thủ khoa là: " + sv.getHoTen() + " (" + sv.getGpa() + ")"));
    }
}
