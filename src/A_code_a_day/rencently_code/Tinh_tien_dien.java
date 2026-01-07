package A_code_a_day.rencently_code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class KhacHang2{
    private String id;
    private String loaiSd;
    private long chiSoCu;
    private long chiSoMoi;
    private int heSo;
    private long thanhTien;
    private long phuTroi;
    private long tongTien;
    public KhacHang2(int id,String loaiSd,long chiSoCu,long chiSoMoi){
        this.id=sinhId(id);
        this.loaiSd=loaiSd;
        this.chiSoCu=chiSoCu;
        this.chiSoMoi=chiSoMoi;
        this.heSo=tinhHeSo();
        this.thanhTien=(this.chiSoMoi-this.chiSoCu)*this.heSo*550;
        this.phuTroi=tinhPhuTroi();
        this.tongTien=this.thanhTien+this.phuTroi;



    }
    private String sinhId(int i){
        return String.format("KH%02d",i);
    }
    private int tinhHeSo(){
        if(this.loaiSd.equals("KD")){
            return 3;
        }
        else if(this.loaiSd.equals("NN")){
            return 5;
        }
        else if(this.loaiSd.equals("TT")){
            return 4;
        }
        else{
            return 2;
        }
    }
    private long tinhPhuTroi(){
        long hieu=this.chiSoMoi-this.chiSoCu;
        if(hieu>100){
            return this.thanhTien;
        }
        else if(hieu>=50&&hieu<=100){
            return Math.round((this.thanhTien*35.0)/100);// đề bài là làm tròn tất
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return id+" "+heSo+" "+thanhTien+" "+phuTroi+" "+tongTien;
    }
    public long getTongTien(){
        return tongTien;
    }

}
public class Tinh_tien_dien {
    public static void main(String[] args) {
        ArrayList<KhacHang2> ds = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String loaiSd=sc.nextLine();
            Long chiSoCu=Long.parseLong(sc.nextLine());
            Long chiSoMoi=Long.parseLong(sc.nextLine());
            ds.add(new KhacHang2(i,loaiSd,chiSoCu,chiSoMoi));
        }
        ds.sort(Comparator.comparing(KhacHang2::getTongTien).reversed());
        for(KhacHang2 x:ds){
            System.out.println(x);
        }


    }
}
