import java.util.Scanner;
public class hackerrankifelse {
    public static void main(String[] Agrs){
        Scanner sc= new  Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0){
            if (a>=2 && a<=5){
                System.out.println(" Not Weird");};
            if (a>=6 && a<=20){
                System.out.println("Weird");};
            if  (a>20){
                System.out.println("Not Weird");
            };  

            }
        else{
            System.out.println("Weird");
        }sc.close();        
            
        }
    }
    

