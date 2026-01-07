package A_code_a_day.rencently_code;


import java.util.ArrayList;
import java.util.Scanner;

class gv{
    String id;
    String name;
    long luongCb;
    String level;
    int heSo;
    long phuCap;
    long thanhTien;
    public gv(String id,String name,long luongCb){
        this.id=id;
        this.name=name;
        this.luongCb=luongCb;
        this.level=layLevel();
        this.heSo=layHeSoLuong();
        this.phuCap=layPhuCap();
        this.thanhTien=(this.luongCb*this.heSo)+phuCap;
    }
    private String layLevel(){
        return id.substring(0,2);
    }
    private int layHeSoLuong(){
        return Integer.parseInt(id.substring(2));
    }
    private long layPhuCap(){
        if(this.level.equals("HT")){
            return 2000000;
        }
        else if(this.level.equals("HP")){
            return 900000;
        }
        else{
            return 500000;
        }
    }
    public String toString(){
        return id+" "+name+" "+heSo+" "+phuCap+" "+thanhTien;
    }

}

public class BangthuNhapGV {
    public static void main(String[] args) {
        ArrayList<gv> ds= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        long x=0;
        long y=0;
        for(int i=1;i<=test;i++){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long luongCb=Long.parseLong(sc.nextLine());

            if(id.contains("HT")){
                x+=1;
            }
            else if(id.contains("HP")){
                y+=1;
            }
            if(id.contains("HT")&&x>1){
                continue;
            }
            else if(id.contains("HP")&&y>2){
                continue;
            }
            else {
                ds.add(new gv(id,name,luongCb));
            }
        }
        for(gv s:ds){
            System.out.println(s);
        }
    }
}
