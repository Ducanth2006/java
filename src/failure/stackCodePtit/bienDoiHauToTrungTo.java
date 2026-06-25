package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bienDoiHauToTrungTo {
    private static String solve(String x){
        Deque<String> deque= new ArrayDeque<>();
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(Character.isLetter(c)){
                deque.push(String.valueOf(c));
            }
            else{
                String a=deque.pop();
                String b=deque.pop();
                deque.push("("+b+c+a+")");
            }
        }
        return deque.pop();

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++){
            String s=sc.next();
            System.out.println(solve(s));

        }
    }
}
