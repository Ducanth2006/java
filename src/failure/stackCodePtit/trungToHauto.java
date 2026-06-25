package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class trungToHauto {
    private final static Deque<Character> deque= new ArrayDeque<>();
    private static boolean isOper(String x){
        return (x.equals("*")||x.equals("+")||x.equals("-")||x.equals("/")||x.equals("^"));
    }
    private static int compare(char x){
        if(x=='^') return 3;
        else if(x=='*'||x=='/') return 2;
        else if (x=='+'||x=='-') return 1;
        else return 0;
    }
    private static void solve(String x){
        deque.clear();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            // gặp chữ cái bth
            if(!isOper(String.valueOf(ch))&&ch!=')'&&ch!='(') sb.append(ch);
            // gặp cái ngoặc ( này
            else if(ch=='('){
                deque.push(ch);
            }
            else if(ch==')'){
                while(!deque.isEmpty()&&deque.peek()!='('){
                    sb.append(deque.pop());
                }
                deque.pop();
            }
            else{
                while(!deque.isEmpty()&&compare(deque.peek())>=compare(ch)){
                    sb.append(deque.pop());
                }
                deque.push(ch);
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
