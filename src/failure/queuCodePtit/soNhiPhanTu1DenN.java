package failure.queuCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class soNhiPhanTu1DenN {
    private static final Deque<String> deque= new ArrayDeque<>();
    private static void solve(int n){
        deque.clear();
        deque.offer("1");
        for(int i=1;i<=n;i++){
            String top=deque.poll();
            System.out.print(top+" ");
            deque.offer(top+0);
            deque.offer(top+1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int test =sc.nextInt();
       for(int t=0;t<test;t++){
           int n=sc.nextInt();
           solve(n);

       }


    }
}
