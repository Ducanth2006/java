package buoi_9_polymorphism.th_07;

public class Main {
    public static void main(String[] args) {
        //polymorphism vì sinhvien it à ck đều có cha là sinhVien
        sinhVien a = new sinhVienIt("ronaldo", 5, 6);
        sinhVien b = new sinhVIenCk("messi", 7, 8);
        a.thongbao();// vân khai báo thằng method thông thường từ thằng tra được
        a.getName();
        System.out.println(a.getDiem());
        b.getName();
        System.out.println(b.getDiem());


    }
}
