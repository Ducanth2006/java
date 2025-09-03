public class SinhVien {
    String maSv;
    String hoTen;
    int tuoi;

    static int soLuong = 0;

    public SinhVien() {
        soLuong++;
    }

    public void setThongTin(String maSv, String hoTen, int tuoi) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSv);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }

    public static void hienThiSoLuong() {
        System.out.println("Tong so luong sinh vien da tao: " + soLuong);
    }
}