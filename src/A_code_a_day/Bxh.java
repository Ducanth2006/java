package A_code_a_day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class sinhVien10{
    String name;
    long c;
    long t;
    public sinhVien10(String name,long c,long t){
        this.name=name;
        this.c=c;
        this.t=t;
    }
    public String toString(){
        return name+" "+c+" "+t;
    }

    public String getName() {
        return name;
    }

    public long getC() {
        return c;
    }

    public long getT(){
        return t;
    }
}
public class Bxh {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<sinhVien10> ds= new ArrayList<>();
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            long c=sc.nextLong();
            long t=sc.nextLong();
            sc.nextLine();
            ds.add(new sinhVien10(name,c,t));
        }
        ds.sort(Comparator.comparing(sinhVien10::getC).reversed().thenComparing(sinhVien10 ::getT).thenComparing(sinhVien10::getName));
        for(sinhVien10 x:ds){
            System.out.println(x);
        }
    }
}
