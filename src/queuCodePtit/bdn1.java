package queuCodePtit;

import java.util.Scanner;

public class bdn1 {
    private static void solve(String x){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<x.length();i++){
            char ch= x.charAt(i);
            if(ch=='0'||ch=='1'){
                sb.append(ch);
            }
            else{
                while(i<x.length()) {
                    sb.append('1');
                    i++;

                }
                break;
            }
        }
        long result=Long.parseLong(sb.toString(),2);
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String x=sc.next();
            solve(x);
        }
    }
}
