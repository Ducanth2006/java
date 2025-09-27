import java.util.Scanner;
public class chialaysothuc{
    public static void main(String[] args){
        Scanner nhap= new Scanner(System.in);
        // int a= nhap.nextInt();
        // int b= nhap.nextInt();
        //System.out.println(a/b); if a=5 and b=2 , result will =2 so we need assign a value float
        // float c=(float)a/b;// we will assign float for a to result =2.5 with a =5 and b =2
        // System.out.println(c); We use cls to clear everything that was written before.
        int d=10000033;
        int f=94434;
        //int g=d*f;wrong result
        // System.out.println(g);result wil equal -549688798 wrong result to fix we need assign float to d and change int g = equal long g =
        long g= (long)d*f;
        System.out.println(g);// the correct result is 944343116322
        nhap.close();


    }


}
