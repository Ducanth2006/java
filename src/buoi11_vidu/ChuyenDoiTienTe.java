package buoi11_vidu;

interface ChuyenDoiTienTe {
    // Phương thức trừu tượng (cần lớp con triển khai)
    double doiSangVND(double amount);

    // Phương thức static trong Interface (Java 8+) dùng static thì thằng con ko cần khai báo, vậy để dùng
    // thằng con phải sử dụng tên của inteface.method
    static double layTyGiaUSD() {
        return 25000.0; // Giả sử tỷ giá cố định
    }

    static void thongBao() {
        System.out.println("Hệ thống chuyển đổi tiền tệ quốc tế.");
    }

    void tien();
}

class NganHangVietCom implements ChuyenDoiTienTe {
    @Override
    public double doiSangVND(double amount) {
        return amount * ChuyenDoiTienTe.layTyGiaUSD();
    }

    public void tien() {
        System.out.println("tien day ");
    }
}

class detal {
    public static void main(String[] args) {
        // Gọi phương thức static trực tiếp từ Interface
        double tyGia = ChuyenDoiTienTe.layTyGiaUSD();
        System.out.println("Ty gia hien tai: " + tyGia);

        ChuyenDoiTienTe.thongBao();

        // Sử dụng qua lớp triển khai
        NganHangVietCom vcb = new NganHangVietCom();
        System.out.println("100 USD = " + vcb.doiSangVND(100) + " VND");
        vcb.tien();
    }
}