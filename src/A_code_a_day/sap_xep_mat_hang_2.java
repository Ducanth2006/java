package A_code_a_day;

import java.util.*;

class product1{

    String id;
    String name;
    String type;
    double giaMua;
    double giaBan;
    double profit;
    public product1(int id,String name,String type,double giaBan,double giaMua){
        this.id=sinhId(id);
        this.name=name;
        this.type=type;
        this.giaBan=giaBan;
        this.giaMua=giaMua;
        this.profit=giaMua-giaBan;
    }
    private String sinhId(int i){
        return String.format("%01d",i);
    }
    public String toString(){
        return id+" "+name+" "+type+" "+String.format("%.2f",profit);

    }
    public double getProfit(){
        return profit;
    }


}
public class sap_xep_mat_hang_2 {
    public static void main(String[] args) {
        List<product1> ds=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=test;i++){
            int id=i;
            String name=sc.nextLine();
            String type=sc.nextLine();
            double giaMua=Double.parseDouble(sc.nextLine());
            double giaBan=Double.parseDouble(sc.nextLine());
            ds.add(new product1(id,name,type,giaMua,giaBan));
        }
        ds.sort(Comparator.comparing(product1::getProfit).reversed());
        for(product1 x:ds){
            System.out.println(x);
        }

    }
}
