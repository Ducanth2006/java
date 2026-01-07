package A_code_a_day.rencently_code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class donHang{
    private String name;
    private String id;
    private long donGia;
    private long soLuong;
    private String stt;
    private String maDonHang;
    private long giamGia;
    private long tongTien;
    public donHang(String name,String id,long donGia,long soLuong){
        this.name=name;
        this.id=id;
        this.donGia=donGia;
        this.soLuong=soLuong;
        this.stt=layStt();
        this.maDonHang=layMaDonHang();
        this.giamGia=tinhGiamGia();
        this.tongTien=(this.soLuong*this.donGia)-this.giamGia;


    }
    private String layStt(){
        return this.id.substring(1,4);
    }
    private String layMaDonHang(){
        String k="";
        for(int i=0;i<this.id.length();i++){
            if (i==this.id.length()-1){
                k= this.id.substring(i);
            }
        }
        return k;
    }
    private long tinhGiamGia(){
        long tong=this.donGia*this.soLuong;
        if(this.maDonHang.equals("1")){
            return tong/2;
        }
        else{
            return (tong*30)/100;
        }
    }
    public String toString(){
        return name+" "+id+" "+stt+" "+giamGia+" "+tongTien;
    }
    public String getStt(){
        return stt;
    }
}
public class TraCuuDonHang {
    public static void main(String[] args) {
        ArrayList<donHang> ds= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            String ma=sc.nextLine();
            long donGia=Long.parseLong(sc.nextLine());
            long sl=Long.parseLong(sc.nextLine());
            ds.add(new donHang(name,ma,donGia,sl));

        }
        ds.sort(Comparator.comparing(donHang::getStt));
        for(donHang x:ds){
            System.out.println(x);
        }
    }
}
