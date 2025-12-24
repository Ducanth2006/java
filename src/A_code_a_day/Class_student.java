package A_code_a_day;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//mã SV, Họ tên, Lớp, Ngày sinh và Điểm GPA (dạng số thực float)
class student {
    String id;
    String name;
    String bd;
    String lop;
    float gpa;

    public student() {
        id = "";
        name = "";
        bd = "";
        gpa = 0f;
        lop = "";
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + bd + " " + String.format("%.2f", gpa);
    }

}

public class Class_student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student st1 = new student();
        st1.id = "B20DCCN001";
        st1.name = sc.nextLine();
        st1.lop = sc.nextLine();
        String bd2 = sc.nextLine();
//      Cần ghi nhớ cách chuyển sang định dạng ngày chuẩn 
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(bd2, inputFormatter);
        DateTimeFormatter outputFomatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        st1.bd = date.format(outputFomatter);
        // end
        st1.gpa = sc.nextFloat();
        System.out.println(st1);


    }
}
