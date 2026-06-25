package failure.Review;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class reviewTrungToHauTo {
    private static final Deque<Character> deque= new ArrayDeque<>();
    private static boolean isOper(char x){
         return x=='*'||x=='-'||x=='/'||x=='+'||x=='^'? true: false;
    }
    private static int compare(char x){
        if(x=='^') return 3;
        else if(x=='*'||x=='/') return 2;
        else if (x=='+'||x=='-') return 1;
        return 0;
    }
    private static void solve(String x){
        deque.clear();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(Character.isLetter(c)) sb.append(c);
            else if(c=='(') deque.push(c);
            else if(c==')'){
                while(!deque.isEmpty()&&deque.peek()!='('){
                    sb.append(deque.pop());
                }
                deque.pop();
            }
            else{
                while(!deque.isEmpty()&&compare(deque.peek())>=compare(c)){
                    sb.append(deque.pop());
                }
                deque.push(c);

            }
        }
        while(!deque.isEmpty()){
            sb.append(deque.pop());
        }
        System.out.println(sb);
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
