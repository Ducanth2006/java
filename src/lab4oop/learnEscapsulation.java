package lab4oop;

public class learnEscapsulation {
    private int soLuong;
    private String mau;

    public learnEscapsulation(String mau, int soLuong) {
        this.soLuong = soLuong;
        this.mau = mau;

    }
    //get

    public String getMau() {
        return this.mau;//lưu í khi get để sử dụng giá trị nhớ đừng truyền tham số đầu vào
    }

    public int getSoluong() {
//        return "đây là bảo mật "+ this.soLuong; lỗi là do thằng int ở cạnh public nó quy định giá trị trả về
        return this.soLuong + 2;
    }

    //set
    public void setMau(String mauNew) {
        this.mau = mauNew;//để để final ở trên nếu để final sẽ ko thể gán được
    }

    public void setSoLuong(int newSoLuong) {
        this.soLuong = newSoLuong;
    }


}
