import java.util.Scanner;
public class _005 {
    public static void main(String[] Agrs){
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            Long a=sc.nextLong();
            System.out.println(a*(a+1)/2);
         }
         sc.close();
     }}
    
