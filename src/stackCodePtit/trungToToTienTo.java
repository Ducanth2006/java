package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class trungToToTienTo {
    private final static Deque<Character> deque= new ArrayDeque<>();
    private static boolean isOper(char x){
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
        StringBuilder sb= new StringBuilder();
        // fix 1 vì chuyển sang tiền tố lên đi ngược trung tố
        for(int i=x.length()-1;i>-1;i--){
            char c=x.charAt(i);
            if(!isOper(c)&&c!=')'&&c!='('){
                sb.append(c);
            }
            // fix 2 và 3 vì sẽ gặp ) trươs chứ ko gặp ( nên đảo lại
            else if(c==')'){
                deque.push(c);
            }
            else if(c=='('){
                while(!deque.isEmpty()&&deque.peek()!=')'){
                    sb.append(deque.pop());
                }
                deque.pop();
            }
            else {
                // thay bằng > thay vì >= nhé
                while(!deque.isEmpty()&&compare(deque.peek())>compare(c)){
                    sb.append(deque.pop());
                }
                deque.push(c);
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
