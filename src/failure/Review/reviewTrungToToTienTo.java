package failure.Review;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class reviewTrungToToTienTo {
    private static final Deque<Character> deque= new ArrayDeque<>();
    private static boolean isOper(char  x){
        if(x=='+'||x=='-'||x=='*'||x=='/'||x=='^') return true;
        else return false;
    }
    private static int compare(char x){
        if(x=='^') return 3;
        else if(x=='*'||x=='/') return 2;
        else if(x=='+'||x=='-') return 1;
        else return 0;
    }
    private static void solve(String x){
        deque.clear();
        StringBuilder sb=new StringBuilder();
        for(int i=x.length()-1;i>-1;i--){
            char ch=x.charAt(i);
            if(!isOper(ch)&&ch!=')'&&ch!='('){
                sb.append(ch);
            }
            else if(ch==')'){
                deque.push(ch);
            }
            else if(ch=='('){
                while(!deque.isEmpty()&&deque.peek()!=')'){
                    sb.append(deque.pop());
                }
                deque.pop();
            }
            else {
                while(!deque.isEmpty()&&(
                        (ch=='^'&&compare(deque.peek())>=compare(ch))||(ch!='^'&&compare(deque.peek())>compare(ch))
                )){
                    sb.append(deque.pop());
                }
                deque.push(ch);
            }
        }
        while(!deque.isEmpty()){
            sb.append(deque.pop());
        }
        System.out.println(sb.reverse());
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
