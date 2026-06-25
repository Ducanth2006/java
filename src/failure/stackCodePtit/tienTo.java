package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class tienTo {
    private static long solve(String []arr){
        Deque<Long> deque= new ArrayDeque<>();
        for(int i=arr.length-1;i>-1;i--){
            String x=arr[i];
            if(x.equals("+")||x.equals("-")||x.equals("/")||x.equals("*")){
                   long a=deque.pop();
                   long b=deque.pop();
                   if(x.equals("+")){
                       deque.push(a+b);
                   }
                   else if (x.equals("-")){
                       deque.push(a-b);
                   }
                   else if(x.equals("*")){
                       deque.push(a*b);
                   }
                   else{
                       deque.push(a/b);
                   }
            }
            else{
                deque.push(Long.parseLong(x));
            }
        }
        return deque.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();

            String [] arr= new String[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.next();
            }
            System.out.println(solve(arr));

        }
    }
}
