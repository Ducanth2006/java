package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class hinhChuNhatLonNhat {
    private static long solve(long []arr){
        Deque<Long> deque= new ArrayDeque<>();
        long maxArea=0;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            long []arr= new long[n+1];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            arr[n]=0;
        }
    }
}
