package Review;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class reviewTienToTrungTo {
    private static final Deque<String> deque= new ArrayDeque<>();
    private static void solve(char[] arrCh){
        deque.clear();

        for(int i=arrCh.length-1;i>-1;i--){
            char ch=arrCh[i];
            if(ch=='*'||ch=='+'||ch=='-'||ch=='/'){
                if(!deque.isEmpty()){
                    deque.push(String.format("(%s%s%s)",deque.pop(),ch,deque.pop()));
                }
            }
            else{
                deque.push(String.valueOf(ch));
            }
        }
        System.out.println(deque.pop());
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char [] arrCh=sc.next().toCharArray();
            solve(arrCh);
        }
    }
}
