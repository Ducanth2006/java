package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bieuThucDungDaiNhat {
    private static final Deque<Integer> deque= new ArrayDeque<>();
    private static void solve(String x){
        deque.clear();
        int sum=0;
        int peer=0;
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(c=='('){
                deque.push(i);
            }
            else{
                if(!deque.isEmpty()&&x.charAt(deque.peek())=='('){
                    deque.pop();
                    sum+=2;
                }

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String x=sc.next();
            solve(x);
        }
    }
}
