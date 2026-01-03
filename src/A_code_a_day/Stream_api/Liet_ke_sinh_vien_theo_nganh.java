package A_code_a_day.Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class sinhVien9 {
    String msv;
    String name;
    String lop;
    String email;


    public String getMsv() {
        return msv;
    }


    public sinhVien9(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }

}
public class Liet_ke_sinh_vien_theo_nganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        ArrayList<sinhVien9> ds= new ArrayList<>();
        for(int i=0;i<test;i++){
            String msv=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();

            String email=sc.nextLine();
            ds.add(new sinhVien9(msv,name,lop,email));
        }

        Map<String, List<sinhVien9>> mapLop= ds.stream().collect(Collectors.groupingBy(sv->sv.getMsv().substring(3,7)));
        int q=Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String maNganh=sc.nextLine();
            String shortName="";
            if(maNganh.equals("Ke toan")){
                shortName="DCKT";
            }
            if(maNganh.equals("Cong nghe thong tin")){
                shortName="DCCN";
            }
            if(maNganh.equals("An toan thong tin")){
                shortName="DCAT";
            }
            if(maNganh.equals("Vien thong")){
                shortName="DCVT";
            }
            if(maNganh.equals("Dien tu")){
                shortName="DCDT";
            }
            List<sinhVien9> dsChuan=mapLop.getOrDefault(shortName,new ArrayList<>());
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",maNganh.toUpperCase());
            System.out.println();
            for(sinhVien9 x:dsChuan){
                String lop = x.lop.toUpperCase();
                if ((shortName.equals("DCCN") || shortName.equals("DCAT")) && lop.startsWith("E")) {
                    continue;
                }
                System.out.println(x);
            }
        }
    }
}
