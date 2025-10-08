// recursion fibonacci
import java.util.Scanner;
public class _1006{
     public static long fibonaci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonaci(n-1)+fibonaci(n-2);
        }

     }
    public static void main(String[] Args){
        Scanner t=new Scanner(System.in);
        int T=t.nextInt();
        for (int i=0;i<=T;i++){
            int n=t.nextInt();
            long result=fibonaci(n);
            System.out.println(result);
            
                

            }

        }
   
       
    
}
