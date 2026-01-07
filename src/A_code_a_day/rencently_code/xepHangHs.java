package A_code_a_day.rencently_code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class hs{
    String name;
    double dtb;
    String id;
    String loai;
    int stt;
    public hs(int id,String name,double dtb){
        this.id=sinhId(id);
        this.name=name;
        this.dtb=dtb;
        this.stt=0;
        this.loai=xepLoai();
    }
    private String sinhId(int i){
        return String.format("HS%02d",i);
    }
    private String xepLoai(){
        double d=this.dtb;
        if(d>=9){
            return "Gioi";
        }
        else if(d<9&&d>=7){
            return"Kha";
        }
        else if(d<7&&d>=5){
            return "Trung Binh";
        }
        else{
            return"Yeu";
        }
    }
    public String toString(){
        return id+" "+name+" "+dtb+" "+loai+" "+stt;
    }
    public double getDtb(){
        return dtb;
    }
    public String getId(){
        return id;
    }
}
public class xepHangHs {
    public static void main(String[] args) {
        ArrayList<hs> ds= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            double dtb=Double.parseDouble(sc.nextLine());
            ds.add(new hs(i,name,dtb));
        }
        ds.sort(Comparator.comparing(hs::getDtb).reversed());
        // sau ở đoạn -1 nhé không phải i+1 đâu
        for(int i=0;i<test;i++){
            if(i>0&&ds.get(i).dtb ==ds.get(i-1).dtb){
                ds.get(i).stt=ds.get(i-1).stt;
            }
            else{
                ds.get(i).stt=i+1;
            }
        }
        ds.sort(Comparator.comparing(hs::getId));
        for(hs x:ds){
            System.out.println(x);
        }

    }
}
