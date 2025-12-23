package A_code_a_day;

import java.util.Scanner;

//Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3 và Tổng điểm.
class students{
    String name;
    String birthday;
    double s1;
    double s2;
    double s3;
    public students(String name,String birthday,double s1,double s2,double s3){
        this.birthday=birthday;
        this.name=name;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    @Override
    public String toString() {
        return name +" "+birthday+" "+String.format("%.1f",(s1+s2+s3));// để ý thằng string format
    }
}
public class Khai_bao_lop_thi_sinh {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        String bd=sc.nextLine();
        double s1= sc.nextDouble();
        double s2= sc.nextDouble();
        double s3= sc.nextDouble();
        students st1= new students(name,bd,s1,s2,s3);
        System.out.println(st1);

    }

}
