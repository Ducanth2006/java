package A_code_a_day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class doanhNghiep1{
    String id;
    String name;
    long n;
    public doanhNghiep1(String id,String name,long n){
        this.id=id;
        this.name=name;
        this.n=n;
    }
    public String getId(){
        return id;
    }
    public long getN(){
        return n;
    }
    public String toString(){
        return id+" "+name+" "+n;
    }

}

public class ds_doanh_nghiep_nhan_sv1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<doanhNghiep1> ds= new ArrayList<>();
        int test=Integer.parseInt(sc.nextLine());
        for(int i=0;i<test;i++){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long n=Long.parseLong(sc.nextLine());
            ds.add(new doanhNghiep1(id,name,n));
        }
        int q=Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:",a,b);
            System.out.println();
            List<doanhNghiep1> dsChuan=ds.stream().filter(gv->gv.getN()>=a&& gv.getN()<=b)
                    .sorted(Comparator.comparing(doanhNghiep1::getN).reversed().thenComparing(doanhNghiep1::getId))
                    .collect(java.util.stream.Collectors.toList());// hài hước phết

            for(doanhNghiep1 x:dsChuan){
                System.out.println(x);
            }
        }


    }
}
