package lab4oop;

public class Student {
    //    thuộc tính
    String fullName;

    int namSinh;
    int namHienTai;

    //    phương thức
    public void getTuoi() {
        System.out.println(namSinh - namHienTai);
    }

    // hàm main
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.fullName = "Mr messi";
        st1.namHienTai = 2025;
        st1.namSinh = 2008;
        st1.getTuoi();


    }

}
