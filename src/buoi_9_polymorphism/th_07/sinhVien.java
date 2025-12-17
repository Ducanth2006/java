package buoi_9_polymorphism.th_07;

//Phương thức trừu tượng là một lời hứa về một hành động getdiem() mà các lớp con bắt buộc phải cài đặt.
public abstract class sinhVien {
    protected String name;

    public sinhVien(String name) {
        this.name = name;
    }

    public abstract void getName();

    public abstract double getDiem();

    // đây là so sánh giữ thằng method thông thường và method abstract(bắt buộc thằng con phải khai báo )
    public void thongbao() {
        System.out.println("Thông báo sinh viên ");
    }

}
