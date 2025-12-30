package A_code_a_day;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class student3{
    String name;
    String lop;
    String ngaySinh;
    double gpa;
    String id;
    public student3(String id,String name,String lop,String ngaySinh,double gpa){
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.ngaySinh=ngaySinh;
        this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+ngaySinh+" "+String.format("%.2f",gpa);
    }
    // dinh dang ngay sinh
    public static String dateFormatter(String bd){
        DateTimeFormatter input=DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date= LocalDate.parse(bd,input);
        DateTimeFormatter output=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(output);
    }
    // sinh msv
    public static String sinhMsv(int j){
        return String.format("B20DCCN%03d",j);
    }
    public static String chuanHoaName(String x){
        String [] tho=x.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String k:tho){
            String wordChuan=k.substring(0,1).toUpperCase()+k.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }

}

public class danh_sach_doi_tuong_sv1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        ArrayList<student3> ds= new ArrayList<>();
        for (int i=1;i<=test;i++){
            String id=student3.sinhMsv(i);
            String name=student3.chuanHoaName(sc.nextLine());
            String lop=sc.nextLine();
            String ngaySinh=student3.dateFormatter(sc.nextLine());
            double gpa= Double.parseDouble(sc.nextLine());

            ds.add(new student3(id,name,lop,ngaySinh,gpa));
        }
        ds.sort(Comparator.comparing(student3::getGpa).reversed());
        for (student3 x:ds){
            System.out.println(x);
        }
    }


}
