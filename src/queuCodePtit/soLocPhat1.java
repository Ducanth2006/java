package queuCodePtit;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class soLocPhat1 {
    private static Deque<String> deque= new ArrayDeque<>();
    private static ArrayList<String> arr= new ArrayList<>();
    private static int countWithRepetition(int n) {
        // Công thức: 2^(n+1) - 2
        return (int) Math.pow(2, n + 1) - 2;
    }
    private static void solve(int n){
        arr.clear();
        deque.clear();
        int n1=countWithRepetition(n);
        deque.offer("6");
        deque.offer("8");
        for(int i=0;i<n1;i++){
            String first=deque.peek();
            arr.add(deque.poll());
            deque.offer(first+"6");
            deque.offer(first+"8");
        }
        System.out.println(n1);
        for(int i =arr.size()-1;i>-1;i--){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test -- >0){
            int n = sc.nextInt();
            solve(n);
        }
    }
}
