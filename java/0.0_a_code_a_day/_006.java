import java.util.Scanner;
public class _006 {
    public static void main(String[] Agrs){
        Scanner sc =new Scanner(System.in);
        float a,b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        if(a==0 && b==0  ){
            System.out.println("VSN");
        }
        else if(a==0 && b!=0){
            System.out.println("VN");
        }
        else{
            float x=-(b)/a;
            System.out.printf("%.2f",x);/* nhớ kỹ là printf nếu muốn thêm  */
        }
        sc.close();
    }
}
