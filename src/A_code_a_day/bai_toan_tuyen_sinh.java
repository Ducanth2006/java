package A_code_a_day;

import java.util.Scanner;

class student2{
        String id ;
        String name;
        double toan;
        double ly;
        double hoa;
        double diemUuTien;
        double tongDiem;
        String ketQua;
        public student2(String id ,String name,double diemUuTien,double tongDiem,String ketQua){
            this.id=id;
            this.name=name;
            this.diemUuTien=diemUuTien;
            this.tongDiem=tongDiem;
            this.ketQua=ketQua;
        }
        public String toString(){
            return id+" "+name+" "+formating(diemUuTien)+" "+formating(tongDiem)+" "+ketQua;
        }
        public static String formating(double x){
            if(x==(long) x){
                return String.format("%d",(long) x);
            }
            else{
                return String.format("%.1f",x);
            }
        }
        public static String ketqua(double x){
            String kq="";
            if (x>=24){
                return kq="TRUNG TUYEN";
            }
            else{
                return kq="TRUOT";
            }
        }
    public static double quetKv(String id){
        String kv=id.substring(0,3);
        double diemUuTien=0;
        if (kv.equals("KV1")){
            return diemUuTien=0.5;
        }
        else if (kv.equals("KV2")){
            return diemUuTien=1;
        }
        else{
            return diemUuTien=2.5;
        }
    }
 }
public class bai_toan_tuyen_sinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String id=sc.nextLine();//dung
        String name=sc.nextLine();//dung
        double toan=sc.nextDouble();
        double ly=sc.nextDouble();
        double hoa=sc.nextDouble();
        double diemUuTien=student2.quetKv(id);//dung
        double tongDiem=ly+hoa+toan*2;//dung
        String ketqua=student2.ketqua(tongDiem+diemUuTien);
        student2 st1=new student2(id,name,diemUuTien,tongDiem,ketqua);
        System.out.println(st1);


    }
}
