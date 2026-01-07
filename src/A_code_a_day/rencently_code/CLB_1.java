package A_code_a_day.rencently_code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class clb{
    String id;
    String name;
    int giaVe;
    String idMatch;
    long sl;
    long tongTien;
    public clb(String id,String name,int giaVe){
        this.id=id;
        this.name=name;
        this.giaVe=giaVe;
        this.idMatch="";
        this.sl=0;
        this.tongTien=0;

    }
    public String toString(){
        return idMatch+" "+name+" "+tongTien;
    }

    public long getTongTien() {
        return tongTien;
    }
    public String getName(){
        return name;
    }
}
class match{
    String id;
    long soLuongKG;
    public match(String id,long soLuongKG){
        this.id=id;
        this.soLuongKG=soLuongKG;
    }
    public String getId(){
        return id.substring(1,3);
    }
    public long getSoLuongKG(){
        return soLuongKG;
    }
    public String toString(){
        return id+" "+soLuongKG;
    }


}

public class CLB_1 {
    public static void main(String[] args) {
        ArrayList<clb> ds1= new ArrayList<>();
        ArrayList<match> ds2= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int soClb=Integer.parseInt(sc.nextLine());
        for(int i=0;i<soClb;i++){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int giaVe=Integer.parseInt(sc.nextLine());
            ds1.add(new clb(id,name,giaVe));
        }
        int soMatch=Integer.parseInt(sc.nextLine());
        for(int i=0;i<soMatch;i++){
            String id=sc.next();
            long sl=Long.parseLong(sc.next());
            ds2.add(new match(id,sl));
            sc.nextLine();
        }
        // dọc thanh cong
        for(match m:ds2){
            for(clb c:ds1){
                if(c.id.equals(m.getId())){
                    c.idMatch=m.id;
                    c.sl=m.soLuongKG;
                    c.tongTien=c.sl*c.giaVe;
//                    System.out.println(c); đây là print theo kia nhé

                }
            }
        }
        ds1.sort(Comparator.comparing(clb::getTongTien).reversed().thenComparing(clb::getName));
        for(clb x:ds1){
            System.out.println(x);
        }





    }
}
