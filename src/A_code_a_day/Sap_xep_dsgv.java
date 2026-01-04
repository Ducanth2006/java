package A_code_a_day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class giangVien{
    String id;
    String name;
    String monDay;
    String kyHieuMon;
    String tenCuoi;
    public giangVien(int id, String name,String monDay){
        this.id=sinhId(id);
        this.name=name;
        this.monDay=monDay;
        this.kyHieuMon=layKyHieu(monDay);
        this.tenCuoi=layName(name);
    }
    public String getTenCuoi(){
        return tenCuoi;
    }
    public String getId(){
        return id;
    }
    private String sinhId(int id){
        return String.format("GV%02d",id);
    }
    public String layName(String x){
        String [] mang=x.trim().toLowerCase().split("\\s+");
        int n= mang.length;
        return mang[n-1];
    }
    private String layKyHieu(String name){
        String [] mang=name.toUpperCase().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String x:mang){
            String kytudau=x.substring(0,1);
            sb.append(kytudau);
        }
        return sb.toString().trim();
    }
    public String toString(){
        return id+" "+name+" "+kyHieuMon;
    }

}
public class Sap_xep_dsgv {
    public static void main(String[] args) {
        ArrayList<giangVien> ds=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            int id=i;
            String name=sc.nextLine();
            String monDay=sc.nextLine();
            ds.add(new giangVien(id,name,monDay));
        }
        ds.sort(Comparator.comparing(giangVien::getTenCuoi).thenComparing(giangVien::getId));
        for(giangVien x:ds){
            System.out.println(x);
        }
    }
}
