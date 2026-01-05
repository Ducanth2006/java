package A_code_a_day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class employee2{
    String id;
    String name;
    long luong;
    long soNgayCong;
    String chucVu;
    long luongThang;
    long thuong;
    long tienPc;
    long tong;
    public employee2(int id,String name,long luong ,long soNgayCong,String chucVu){
        this.id=sinhId(id);
        this.name=name;
        this.luong=luong;
        this.soNgayCong=soNgayCong;
        this.chucVu=chucVu;
        this.luongThang=luong*soNgayCong;
        this.thuong=tinhThuong(this.luongThang,soNgayCong);
        this.tienPc=tinhPhuCap(chucVu);
        this.tong=this.luongThang+this.thuong+this.tienPc;
    }
    public long getTong(){
        return tong;
    }
    private String sinhId(int i){
        return String.format("NV%02d",i);
    }
    private long tinhThuong(long luongThang,long soNgayCong){
        long tienThuong=0;
        if(soNgayCong>=25){
            tienThuong=(luongThang*20)/100;
        }
        if(soNgayCong>=22&&soNgayCong<25){
            tienThuong=(luongThang*10)/100;
        }
        if(soNgayCong<22){
            tienThuong=0;
        }
        return tienThuong;
    }
    private long tinhPhuCap(String chucVu){
        long tienPc=0;
        if(chucVu.equals("GD")){
            tienPc=250000;
        }
        if(chucVu.equals("PGD")){
            tienPc= 200000;
        }
        if(chucVu.equals("TP")){
            tienPc=180000;
        }
        if(chucVu.equals("NV")){
            tienPc=150000;
        }
        return tienPc;
    }
    public String toString(){
        return id+" "+name+" "+luongThang+" "+thuong+" "+tienPc+" "+tong;
    }



}
public class BangKeTienLuong {
    public static void main(String[] args) {
        ArrayList<employee2> ds=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        long sum=0;
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            long luong=Long.parseLong(sc.nextLine());
            long snc=Long.parseLong(sc.nextLine());
            String position=sc.nextLine();
            ds.add(new employee2(i,name,luong,snc,position));


        }
        ds.sort(Comparator.comparing(employee2::getTong).reversed());
        for(employee2 x:ds){
            System.out.println(x);

        }

    }
}
