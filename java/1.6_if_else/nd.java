import java.util.Scanner;
public class nd {
    public static void main(String[] Args){
        Scanner nhap=new Scanner(System.in);
        int a=nhap.nextInt();
        int b=50;
        if (a>=b){
            System.out.println("yes");
        }
        else  {
            System.out.println("no");

        }nhap.close();
    }
    
}
