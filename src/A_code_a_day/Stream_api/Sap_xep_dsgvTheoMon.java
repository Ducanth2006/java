package A_code_a_day.Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class giangVien1{
    String id;
    String name;
    String monDay;
    String kyHieuMon;

    public giangVien1(int id, String name,String monDay){
        this.id=sinhId(id);
        this.name=name;
        this.monDay=monDay;
        this.kyHieuMon=layKyHieu(monDay);

    }
    public String getId(){
        return id;
    }
    private String sinhId(int id){
        return String.format("GV%02d",id);
    }
    public static String layKyHieu(String name){
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
    public String getKyHieuMon(){
        return kyHieuMon;
    }

}

public class Sap_xep_dsgvTheoMon {
    public static void main(String[] args) {
        ArrayList<giangVien1> ds=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            int id=i;
            String name=sc.nextLine();
            String monDay=sc.nextLine();
            ds.add(new giangVien1(id,name,monDay));
        }
        int q=Integer.parseInt(sc.nextLine());
        Map<String, List<giangVien1>> mapDs=ds.stream().collect(Collectors.groupingBy(gv->gv.getKyHieuMon()));
        for (int i=0;i<q;i++){
            String tenMonQ=sc.nextLine();
            String kyHieuInput=giangVien1.layKyHieu(tenMonQ);
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n",kyHieuInput);
            System.out.println();
            List<giangVien1> dsChuan=mapDs.getOrDefault(kyHieuInput,new ArrayList<>());
            for(giangVien1 x:dsChuan){
                System.out.println(x);
            }

        }
    }
}
