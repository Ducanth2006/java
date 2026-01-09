package A_code_a_day.rencently_code;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

class cuaHang {
    String maSP;
    String nameSP;
    long tien;
    long hanBH;
    public cuaHang(String maSP,String nameSP,long tien,long hanBH){
        this.maSP=maSP;
        this.nameSP=maSP;
        this.tien=tien;
        this.hanBH=hanBH;
    }
    public String getMaSP(){
        return maSP;
    }
    public long getTien(){
        return tien;
    }

    public long getHanBH() {
        return hanBH;
    }
}
class khachHang3{
    String maKh;
    String nameKh;
    String diaChi;
    String maSp;
    long soLuongMua;
    String ngayMua;
    long tien;
    long hanBH;
    long tongTien;
    String ngayHetHan;
    public khachHang3(int id,String nameKh,String diaChi,String maSp,long soLuongMua,String ngayMua,long tongTien,String ngayHetHan){
        this.maKh=String.format("KH%02d",id);
        this.nameKh=nameKh;
        this.diaChi=diaChi;
        this.maSp=maSp;
        this.soLuongMua=soLuongMua;
        this.ngayMua=ngayMua;
        this.tien=0;
        this.hanBH=0;
        this.tongTien=tongTien;
        this.ngayHetHan=ngayHetHan;
    }

    @Override
    public String toString() {
        return maKh+" "+nameKh+" "+diaChi+" "+maSp+" "+tongTien+" "+ngayHetHan;
    }
    public static String tinhHan(String ngayMua,long hanBH){
        LocalDate date= LocalDate.parse(ngayMua, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate ngayToiHan=date.plusMonths(hanBH);
        return ngayToiHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public long getHanBH() {
        return hanBH;
    }

    public LocalDate getNgayHetHan() {
        return LocalDate.parse(ngayHetHan,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getMaKh() {
        return maKh;
    }
}
public class tinhNgayHetHanBaoHanh {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("MUAHANG.in"));
        ArrayList<cuaHang> dsSp=new ArrayList<>();
        ArrayList<khachHang3> dsKh= new ArrayList<>();
        int soSp=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=soSp;i++){
            String maSp=sc.nextLine();
            String nameSp=sc.nextLine();
            long tien=Long.parseLong(sc.nextLine());
            long hanBH=Long.parseLong(sc.nextLine());
            dsSp.add(new cuaHang(maSp,nameSp,tien,hanBH));
        }
        Map<String, List<cuaHang>> locTheoMa=dsSp.stream().collect(Collectors.groupingBy(cuaHang::getMaSP));
        int soKhacHang=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=soKhacHang;i++){
            String nameKh=sc.nextLine();
            String diaChi=sc.nextLine();
            String maSp=sc.nextLine();
            long soLuongMua=Long.parseLong(sc.nextLine());
            String ngayMua=sc.nextLine();
            List<cuaHang> dsLoc=locTheoMa.get(maSp);
            long tongTien=0;
            String ngayHetHan="";
            for(cuaHang x:dsLoc){
                tongTien=soLuongMua*x.tien;
                ngayHetHan=khachHang3.tinhHan(ngayMua,x.hanBH);
            }

            dsKh.add(new khachHang3(i,nameKh,diaChi,maSp,soLuongMua,ngayMua,tongTien,ngayHetHan));
        }
        dsKh.sort(Comparator.comparing(khachHang3::getNgayHetHan).thenComparing(khachHang3::getMaKh));
        for(khachHang3 x:dsKh){
            System.out.println(x);
        }
        // doc thanh cong


    }
}
