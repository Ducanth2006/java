package lab4oop;

public class Student {
    //    thuộc tính
    String fullName;
    int namSinh;
    int namHienTai;
    // dùng constructor có tham so
    public Student(String fullName, int namSinh, int namHienTai){
        this.fullName=fullName;
        this.namHienTai=namHienTai;
        this.namSinh=namSinh;
    }

    //    phương thức
    public void getTuoi() {
        System.out.println(namSinh - namHienTai);
    }

    // hàm main
    public static void main(String[] args) {
        Student st1 = new Student("Mr messi", 2008, 2025);
        st1.fullName = "Mr ronaldo ";//sẽ ghi đè được nhé
        st1.namHienTai = 2025;
        st1.namSinh = 2008;
        st1.getTuoi();


    }

}
