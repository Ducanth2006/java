package A_code_a_day;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class sinhVien5{
    String id;
    String name;
    String lop;
    String email;
    public String getLop(){
        return lop;

    }
    public String getId(){
        return id;
    }
    public sinhVien5(String id,String name,String lop,String email){
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.email=email;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+lop+" "+email;
    }
}

public class Sap_xep_sinh_vien_theo_lop {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        ArrayList<sinhVien5> ds= new ArrayList<>();
        int test=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=test;i++){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            ds.add(new sinhVien5(id,name,lop,email));
        }
        ds.sort(Comparator.comparing(sinhVien5::getLop).thenComparing(sinhVien5::getId));
        for(sinhVien5 x:ds){
            System.out.println(x);
        }



    }
}
