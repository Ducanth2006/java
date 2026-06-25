package failure.queuCodePtit;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class so0Va9 {
    private static final Deque<String> deque= new ArrayDeque<>();
    private static void solve(int n){
        deque.clear();
        BigInteger target=new BigInteger(String.valueOf(n));
        deque.offer("9");
        while(!deque.isEmpty()){
            String current= deque.poll();
            BigInteger cur=new BigInteger(current);
            if(cur.mod(target).equals(BigInteger.ZERO)){
                System.out.println(cur);
                return;
            }
            deque.offer(current+"0");
            deque.offer(current+"9");

        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for( int t=0;t<test;t++){
            int n=sc.nextInt();
            solve(n);
        }
    }
}
