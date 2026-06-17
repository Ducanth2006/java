package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class soSanhBieuThuc {
    private static final Deque<Integer> deque= new ArrayDeque<>();
    private static String change(String x){
        deque.clear();
        StringBuilder sb= new StringBuilder();
        deque.push(0);
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(Character.isLetter(c)) sb.append(c);
            else if(c=='('){
                if(!deque.isEmpty()){
                    int top=deque.peek();
                    if(i>0&&x.charAt(i-1)=='-'){
                        deque.push(top==0?1:0);
                    }
                    else{
                        deque.push(top);
                    }
                }
            }
            else if(c==')'){
                if(!deque.isEmpty()){
                    deque.pop();
                }
            }
            else {
                if(!deque.isEmpty()){
                    int top=deque.peek();
                    if(top==1){
                        sb.append(c=='+'?'-':'+');
                    }
                    else{
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
    private static void solve(String x,String y){
        String k1=change(x);
        String k2=change(y);
        if(k1.equals(k2)) System.out.println("YES");
        else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String x1=sc.nextLine();
            String x2=sc.nextLine();
            solve(x1,x2);

        }
    }
}
