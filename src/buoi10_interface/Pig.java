package buoi10_interface;

public class Pig implements IAnimal {
    public void keu() {
        System.out.println("ủn ỉn ");
    }

    public void run() {
        System.out.println("Chạy bằng bốn chân");
    }

    public void ancam() {
        System.out.println("Lơn Ăn cám ");
    }

    // ta thử gán lại giá trị của interface xem
    public static void main(String[] args) {
//        dùng đa hình nhé nhìn
        Pig pig1 = new Pig();//Bạn có quyền gọi tất cả các hàm mà lớp Pig có (bao gồm cả những hàm không nằm trong Interface).
        pig1.keu();
        pig1.run();
        System.out.println("Lợn hít thở bằng " + IAnimal.hit_tho);
        IAnimal pig2 = new Pig();//Bạn chỉ được gọi những hàm đã khai báo trong IAnimal. Các hàm riêng của lớp Pig sẽ bị "ẩn" đi.
//        pig2.ancam(); lỗi do ăn cám ko lần trong interface
        if (pig2 instanceof Pig p) p.ancam();// ép thằng ianimal xuống thằng pig để gọi thuộc tính riêng của nó

    }
}
