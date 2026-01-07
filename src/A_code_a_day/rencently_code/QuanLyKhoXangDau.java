package A_code_a_day.rencently_code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class tt{
    String code, name;
    Long price, tax, sum, fin;

    public tt(String code, long sl){
        this.code = code;
        this.name = getName(code);
        this.price = price(code);
        this.sum = this.price * sl;
        this.tax = tax(this.sum, code);
        this.fin = this.sum + this.tax;
    }
    private String getName(String s){
        if(s.endsWith("BP")) return "British Petro";
        if(s.endsWith("ES")) return "Esso";
        if(s.endsWith("SH")) return "Shell";
        if(s.endsWith("CA")) return "Castrol";
        if(s.endsWith("MO")) return "Mobil";
        return "Trong Nuoc";
    }

    private long tax(long x, String code){
        if(code.endsWith("TN")) return 0;
        if(code.startsWith("X")) return x*3/100;
        if(code.startsWith("D")) return x*7/200;
        return x/50;
    }

    private long price(String code){
        if(code.startsWith("X")) return 128000;
        if(code.startsWith("D")) return 11200;
        return 9700;
    }

    public String toString() {
        return code + " " + name + " " + price + " " + tax + " " + fin;
    }
    public long getFin(){
        return fin;
    }
}

public class QuanLyKhoXangDau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<tt> ds= new ArrayList<>();
        int test=Integer.parseInt(sc.nextLine());
        for(int i=0;i<test;i++){
            String code=sc.next();
            long sl=Long.parseLong(sc.next());
            ds.add(new tt(code,sl));
        }
        ds.sort(Comparator.comparing(tt::getFin).reversed());
        for(tt x:ds){
            System.out.println(x);
        }
    }
}
