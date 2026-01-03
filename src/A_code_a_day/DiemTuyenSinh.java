package A_code_a_day;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class thiSinh1{
    String id;
    String name;
    double diemThi;
    String danToc;
    int kV;
    double tongDiem;
    String status;
    public thiSinh1(int id,String name,double diemThi,String danToc,int kV){
        this.id=sinhId(id);
        this.name=chuanHoaName(name);
        this.diemThi=diemThi;
        this.danToc=danToc;
        this.kV=kV;
        this.tongDiem=tinhTongDiem(diemThi,danToc,kV);
        this.status=check(tongDiem);
    }
    public double getTongDiem(){
        return tongDiem;
    }
    public String getId(){
        return id;
    }
    private String sinhId(int i){
        return String.format("TS%02d",i);
    }
    private String chuanHoaName(String x){
        String []tho=x.trim().toLowerCase().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String k:tho){
            String wordChuan=k.substring(0,1).toUpperCase()+k.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }
    private double tinhTongDiem(double diemThi,String danToc,int kV){
        double diemThuong=0;
        if(kV==1){
            diemThuong+=1.5;
        } else if (kV==2) {
            diemThuong+=1;
        }
        if(!danToc.equals("Kinh")){
            diemThuong+=1.5;
        }
        return diemThuong+diemThi;
    }
    private String check(double tongDiem){
        String status="";
        if(tongDiem>=20.5){
            status="Do";
        }
        else{
            status="Truot";
        }
        return status;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.1f",tongDiem)+" "+status;
    }
}
public class DiemTuyenSinh  {
    public static void main(String[] args) throws IOException {
        Scanner reader=new Scanner(new File("THISINH.in")) ;
        ArrayList<thiSinh1> ds=new ArrayList<>();
        int test=reader.nextInt();
        reader.nextLine();
        for(int i=1;i<=test;i++){
            int id=i;
            String name=reader.nextLine();
            Double diemThi=Double.parseDouble(reader.nextLine());
            String danToc=reader.nextLine();
            int kV=Integer.parseInt(reader.nextLine());
            ds.add(new thiSinh1(id,name,diemThi,danToc,kV));
        }
        ds.sort(Comparator.comparing(thiSinh1::getTongDiem).reversed().thenComparing(thiSinh1::getId));
        for(thiSinh1 s:ds){
            System.out.println(s);
        }

    }

}
