package A_code_a_day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class sinhVien6{
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
    public sinhVien6(String id,String name,String lop,String email){
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
public class ko_cho_testCase_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<sinhVien6> ds=new ArrayList<>();
        while(sc.hasNextLine()){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            ds.add(new sinhVien6(id,name,lop,email));

        }
        ds.sort(Comparator.comparing(sinhVien6::getId));
        for (sinhVien6 x:ds){
            System.out.println(x);
        }
    }
}
