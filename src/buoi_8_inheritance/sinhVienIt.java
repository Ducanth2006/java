package buoi_8_inheritance;

public class sinhVienIt extends sinhVien {
    private final String language;

    public sinhVienIt(String language, String name, double id, double price, double tax) {
        super(name, id, price, tax);
        this.language = language;
    }

    @Override
    public double getTongHocPhiMoi() {
        double tongHocPhiGoc = super.getTongHocPhiMoi();

        // Áp dụng giảm 5%
        return tongHocPhiGoc * 0.95;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Riêng It sẽ được giảm 5%");
        System.out.println("Học phí cuối cùng là " + getTongHocPhiMoi());
        System.out.println(super.name);

    }


}
