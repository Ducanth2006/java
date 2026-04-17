package CodePtit;

import java.util.Scanner;

public class tradeMoney {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        int [] prices=new int[]{1000,500,200,100,50,20,10,5,2,1};
        for(int i=0;i<test;i++){
            int sum=0;
            int n=sc.nextInt();
            for(int t:prices){
                if(n>=t){
                    sum+=n/t;
                    n=n%t;
                }
            }
            System.out.println(sum);
        }
    }
}
