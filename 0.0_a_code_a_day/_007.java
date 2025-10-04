import java.util.Scanner;
public class _007 {
    public static void main(String[] Agrs){
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            long a=sc.nextLong();
            int d=0;
            if (a==2){System.out.println("YES");}
            else if (a<2){System.out.println("NO");}
            else if (a%2==0){System.out.println("NO");}
            else{
                for(int b=3;b<=Math.sqrt(a);b+=2){
                    if (a%b==0){
                        System.out.println("NO");
                        d+=1;
                        break;
                        }
                   
                    }
                    if (d==0){
                System.out.println("YES");
            }

            }
     
            
            }

             sc.close();


         }
     }
    
    
