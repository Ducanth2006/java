package A_code_a_day.rencently_code;

import java.util.*;
import java.util.stream.Collectors;

class product2{
    String id;
    String name;
    long soLuong;
    long donGia;
    long tienChietKhau;
    long thanhTien;
    public product2(String name,long soLuong,long donGia){
        this.name=name;
        this.soLuong=soLuong;
        this.donGia=donGia;
        this.id=layMa();
        this.tienChietKhau=tinhTienChietKhau();
        this.thanhTien=(this.soLuong*this.donGia)-this.tienChietKhau;
    }
    public String getId(){
        return id;
    }
    private long tinhTienChietKhau(){
        long tongTien=0;
        if(soLuong>10){
            tongTien=(this.donGia*this.soLuong)/20;
        }
        if(soLuong<=10&&soLuong>=8){
            tongTien=(this.donGia*this.soLuong)/50;
        }
        if(soLuong<8&&soLuong>=5){
            tongTien=(this.donGia*this.soLuong)/100;
        }
        else{
            tongTien=(this.donGia*this.soLuong);
        }
        return tongTien;
    }
    private String layMa(){
        String [] mang=this.name.trim().toUpperCase().split("\\s+");
        String ma=mang[0]+mang[1];
        return ma;
    }
    public static String layMaP(String n){
        String [] mang=n.trim().toUpperCase().split("\\s+");
        String ma=mang[0]+mang[1];
        return ma;
    }
    public static String sinhId(int i){
        return String.format("%02d",i);
    }


}
public class Bang_ke_nhap_kho {
    public static void main(String[] args) {
        ArrayList<product2> ds= new ArrayList<>();
        Map<String,Integer> mapDs=new HashMap<>();
        Scanner sc= new Scanner(System.in);
        long test=Long.parseLong(sc.nextLine());
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            String ma=product2.layMaP(name);
            long soLuong=Long.parseLong(sc.nextLine());
            long donGia=Long.parseLong(sc.nextLine());
            ds.add(new product2(name,soLuong,donGia));
            if(mapDs.get(ma)==null){
                mapDs.put(ma,1);
            }
            else{
                mapDs.put(ma,mapDs.get(ma)+1);
            }
        }




    }
}
