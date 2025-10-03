import java.util.Scanner;
public class _004 {
    public static void main(String[] Agrs){
        Scanner sc =new Scanner(System.in);
        int height= sc.nextInt();
        int width =sc.nextInt();
        if(height <=0 || width <=0){
            System.out.println(0);
        }
        else{
            System.out.print(((height+width)*2)+" "+(height*width));

        }
        sc.close();
    }
}
