package buoi11_vidu_static;

public class test {
    public static void main(String[] args) {
        System.out.println(ChuyenDoiTienTe.layTyGiaUSD());// do static mà ta lấy đc interface này mà ko cần dùng implements
        ChuyenDoiTienTe.thongBao();
//      ChuyenDoiTienTe.tien() do ko có static nên ko sử dụng đc từ inteface , muốn dùng phải implements
    }
}
