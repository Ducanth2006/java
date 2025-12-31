package A_code_a_day.baitoanbig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// diem trung binh %.2f ,danh sách theo điểm trung bình giảm dần,nếu điểm bằng nhau thì thứ hạng cũng bằng nhau.
//Họ tên: có thể chưa được chuẩn hóa   Mã sinh viên (tự động tăng theo thứ tự nhập, tính từ SV01)
// Chú ý: 2 sinh viên có điểm trung bình bằng nhau thì xếp hạng bằng nhau,
// và nếu có 2 sinh viên hạng là X thì sinh viên tiếp theo trong danh sách có hạng X+2.
// Trong trường hợp xếp hạng bằng nhau thì cần sắp xếp theo mã sinh viên tăng dần.
class Student5{
    String id;
    String name;
    double mon1;
    double mon2;
    double mon3;
    double diemTb;
    int top;
    public Student5(String id,String name,double mon1, double mon2,double mon3){
        this.id=id;
        this.name=chuanHoaName(name);
        this.mon1=mon1;
        this.mon2=mon2;
        this.mon3=mon3;
        this.diemTb=(mon1*3+mon2*3+mon3*2)/8;
        this.top=0;
    }
    public void setTop(int top){
        this.top=top;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public int getTop() {
        return top;
    }
    public String getId(){
        return id;
    }

    public String chuanHoaName(String x){
        String [] tho=x.trim().toLowerCase().split("\\s+");
        StringBuilder sb= new StringBuilder();
        for (String k:tho){
            String wordChuan=k.substring(0,1).toUpperCase()+k.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }

    public String toString(){
        return id+" "+name+" "+String.format("%.2f",diemTb)+" "+top;
    }
    public static String sinhId(int i){
        return String.format("SV%02d",i);
    }

}
public class tinh_diem_trung_binh {
    public static void main(String[] args) {
        try{
            Scanner reader=new Scanner(new File("file23.txt"));
            ArrayList<Student5> ds= new ArrayList<>();
            int test=reader.nextInt();
            reader.nextLine();
            for (int i=1;i<=test;i++){
                String id=Student5.sinhId(i);
                String name=reader.nextLine();
                double mon1=Double.parseDouble(reader.nextLine());
                double mon2=Double.parseDouble(reader.nextLine());
                double mon3=Double.parseDouble(reader.nextLine());
                ds.add(new Student5(id,name,mon1,mon2,mon3));
            }
            ds.sort(Comparator.comparing(Student5::getDiemTb).reversed());
            // xư ly rank trung nhau cần học
            // quá tỉnh khi tao đặt top default =0
            for (int i=0;i<ds.size();i++){
                if(i>0&& ds.get(i).diemTb==ds.get(i-1).diemTb){
                    ds.get(i).top=ds.get(i-1).top;
                }
                else{
                    ds.get(i).top=i+1;// tại sao +i bởi vì tao đã sắp xếp theo giảm dần gpa rồi nhé
                }
            }
            ds.sort(Comparator.comparing(Student5::getTop).thenComparing(Student5::getId));
            for(Student5 x:ds){
                System.out.println(x);
            }





        }catch(FileNotFoundException e){

        }
    }
}
