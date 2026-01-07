package A_code_a_day.rencently_code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class hang{
    private String id;
    private long soLuongNhap;
    private long soLuongXuat;
    private long donGia;
    private long tien;
    private long tax;
    public hang(String id, long soLuongNhap){
        this.id=id;
        this.soLuongNhap=soLuongNhap;
        this.soLuongXuat=tinhExport();
        this.donGia=tinhDonGia();
        this.tien=this.donGia*this.soLuongXuat;
        this.tax=tinhThue();

    }
    public String getId(){
        return id.substring(0,1);
    }
    public long getTax(){
        return tax;
    }
    private long tinhExport(){
        String x=this.id;
        if(x.startsWith("A")){
            return Math.round((this.soLuongNhap*3.0)/5);
        }
        else{
            return Math.round((this.soLuongNhap*7.0)/10);
        }
    }
    private long tinhDonGia(){
        String x=this.id;
        if(x.endsWith("Y")){
            return 110000;
        }
        else{
            return 135000;
        }
    }
    private long tinhThue(){
        String x=this.id;
        if(x.startsWith("A")&&x.endsWith("Y")){
            return (this.tien*8)/100;
        }
        else if(x.startsWith("A")&&x.endsWith("N")){
            return (this.tien*11)/100;
        }
        else if(x.startsWith("B")&&x.endsWith("Y")){
            return (this.tien*17)/100;
        }
        else{
            return  (this.tien*22)/100;
        }

    }
    public String toString(){
        return id+" "+soLuongNhap+" "+soLuongXuat+" "+donGia+" "+tien+" "+tax;
    }



}
public class BangTDNhapXh {
    public static void main(String[] args) {
        ArrayList<hang> ds=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String id=sc.nextLine();
            long soLuongNhap=Long.parseLong(sc.nextLine());
            ds.add(new hang(id,soLuongNhap));
        }


        String q=sc.nextLine();
        List<hang> dsCHuan=ds.stream().filter(s->s.getId().equals(q)).sorted(Comparator.comparing(hang::getTax).reversed()).collect(Collectors.toList());
        for(hang x:dsCHuan){
            System.out.println(x);
        }

    }
}
