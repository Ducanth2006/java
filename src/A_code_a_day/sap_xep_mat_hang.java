package A_code_a_day;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class hang{
    String id ;
    String name;
    String nhomHang;
    int giaMua;
    int giaBan;
    double profit;
    hang(String id ,String name,String nhomHang,double profit){
        this.name=name;
        this.id=id;
        this.nhomHang=nhomHang;
        this.profit=profit;
    }

    public double getProfit() {
        return profit;
    }
    // sinh maKh
    public static String sinhMaKh(int x){
        return String.format("MH%02d",x);
    }
    public String toString(){
        return id+" "+name+" "+nhomHang+" "+String.format("%.2f",profit);
    }
}
public class sap_xep_mat_hang {
    public static double tinhProfit(double k,double h){
        return h-k;
    }

    public static void main(String[] args) {
        ArrayList<hang> ds= new ArrayList<>();
        try{
            Scanner reader=new Scanner(new File("MATHANG.in"));
            int test=reader.nextInt();
            reader.nextLine();
            for (int i =1;i<=test;i++){
                String name=reader.nextLine();
                String nhomHang=reader.nextLine();
                double giaMua=Double.parseDouble(reader.nextLine());
                double giaBan=Double.parseDouble(reader.nextLine());
                ds.add(new hang(hang.sinhMaKh(i),name,nhomHang,tinhProfit(giaMua,giaBan)));

            }
            ds.sort(Comparator.comparing(hang::getProfit).reversed());
            for(hang x:ds){
                System.out.println(x);
            }
        }catch(FileNotFoundException e){

        }
    }

}
