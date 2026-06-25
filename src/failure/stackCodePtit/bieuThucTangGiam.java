package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bieuThucTangGiam {
    private static String solve(String x){
        Deque<String> deque= new ArrayDeque<>();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<=x.length();i++){
            deque.push(String.valueOf(i+1));
            if(i==x.length()||x.charAt(i)=='I'){
                while(!deque.isEmpty()){
                    sb.append(deque.pop());
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int t=0;t<test;t++){
            String x=sc.next();
            System.out.println(solve(x));

        }
    }
}
