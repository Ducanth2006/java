package A_code_a_day.rencently_code;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class vdv{
     String id;
     String name;
     String bd;
     LocalTime tgXuatPhat;
     LocalTime tgDenDich;
     String  tgUuTien;
     String thoiGianThucTe;
     String tongTime;
     long rank;
     public vdv(int i,String name,String bd,String tgXuatPhat,String tgDenDich){
         this.id=sinhId(i);
         this.name=name;
         this.bd=bd;
         this.tgXuatPhat=LocalTime.parse(tgXuatPhat);
         this.tgDenDich=LocalTime.parse(tgDenDich);
         this.tgUuTien=tinhTgUuTien();
         this.thoiGianThucTe=tinhThoiGianTT();
         this.tongTime=tinhTongTime();
         this.rank=0;
     }
     private String sinhId(int i){
         return String.format("VDV%02d",i);
     }
     private String tinhTgUuTien() {
         int namSinh = Integer.parseInt(this.bd.split("/")[2]);
         int namSinh1=2021-namSinh;
         if (namSinh1 < 18) {
             return "00:00:00";
         } else if (namSinh1 < 25) {
             return "00:00:01";
         } else if (namSinh1 < 32) {
             return "00:00:02";
         }
         else{
             return "00:00:03";
         }
     }
     private String tinhThoiGianTT(){

         long tongS= ChronoUnit.SECONDS.between(this.tgXuatPhat,this.tgDenDich);
         long h=tongS/3600;
         long m=(tongS%3600)/60;
         long s=tongS%60;
         return String.format("%02d:%02d:%02d",h,m,s);

     }
     private String tinhTongTime(){
         LocalTime uuTien=LocalTime.parse(this.tgUuTien);
         LocalTime realTime=LocalTime.parse(this.thoiGianThucTe);
         long tongS=ChronoUnit.SECONDS.between(uuTien,realTime);
         long h=tongS/3600;
         long m=(tongS%3600)/60;
         long s=tongS%60;
         return String.format("%02d:%02d:%02d",h,m,s);

     }
     public LocalTime getTongTime(){
         return LocalTime.parse(tongTime);
     }
     public String getId(){
         return id;
     }
     public String toString(){
         return id+" "+name+" "+thoiGianThucTe+" "+tgUuTien+" "+tongTime+" "+rank;
     }
     public long getRank(){
         return rank;
     }

}
public class XH_VDV {
    public static void main(String[] args) {
        ArrayList<vdv> ds=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            String bd=sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            ds.add(new vdv(i,name,bd,start,end));

        }
        ds.sort(Comparator.comparing(vdv::getTongTime));
        for (int k = 0; k < ds.size(); k++) {
            if (k > 0 && ds.get(k).getTongTime().equals(ds.get(k - 1).getTongTime())) {
                ds.get(k).rank = ds.get(k - 1).rank;
            } else {
                ds.get(k).rank = k + 1;
            }
        }
        ds.sort(Comparator.comparing(vdv::getId));
        ds.sort(Comparator.comparing(vdv::getRank));
        for(vdv s:ds){
            System.out.println(s);
        }

    }

}
