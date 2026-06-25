package failure.giaiThuatThamLam;

import java.util.Scanner;

public class nhamChuSo {
    private static void timTongMinMax(String a,String b){
        long minA=Long.parseLong(a.replace('6','5'));
        long minB=Long.parseLong(b.replace('6','5'));
        long maxA=Long.parseLong(a.replace('5','6'));
        long maxB=Long.parseLong(b.replace('5','6'));
        long sumMin=minA+minB;
        long sumMax=maxA+maxB;
        System.out.println(sumMin+" "+sumMax);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        timTongMinMax(a,b);
    }
}
