package A_code_a_day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class student1{
    String id;
    String name;
    String lop;
    double s1;
    double s2;
    double s3;

    public student1(String id,String name,String lop, double s1,double s2,double s3){
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;

    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+s1+" "+s2+" "+s3;
    }
}
public class Bang_diem_tp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<student1> ds= new ArrayList<>();
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){

            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            double s1=Double.parseDouble(sc.nextLine());
            double s2=Double.parseDouble(sc.nextLine());
            double s3=Double.parseDouble(sc.nextLine());
            ds.add(new student1(id,name,lop,s1,s2,s3));

        }
        ds.sort(Comparator.comparing(student1::getId));
        // sử dụng thằng ở ngoài để thêm vào nhé kkk ngu  quá tôi mãi ko nghĩ ra
        int stt=1;
        for(student1 x:ds){
            System.out.println(stt+" "+x);
            stt++;
        }
    }
}
