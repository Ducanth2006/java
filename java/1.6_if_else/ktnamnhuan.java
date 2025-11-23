import java.util.Scanner;
public class ktnamnhuan {
    public static void main(String[] Agrs){
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if (year %400==0 || (year%4==0 && year%100!=0)){
            System.out.println("năm nhuận");
        }
        else {
            System.out.println("không phải năm nhuận");
        }
        sc.close();

    }
}
