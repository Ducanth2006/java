package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bieuThucTuongDuong {
    private final static Deque<Integer> deque= new ArrayDeque<>();
    private static void solve(String x){
        deque.clear();
        deque.push(0);// 0 là không đổi , 1 là đổi
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            // là chữ thì thêm vào luôn
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            // gặp ( thì ta sẽ kiểm tra toán tử đứng trc
            else if(ch=='('){
                if(!deque.isEmpty()){
                    int top=deque.peek();
                    // nếu là dấu - thì đảo lại thôi
                    if(i>0&&x.charAt(i-1)=='-'){
                        deque.push(top==0?1:0);
                    }
                    else{
                        deque.push(top);
                    }
                }
            }
            else if(ch==')'){
                if(!deque.isEmpty()){
                    deque.pop();
                }
            }
            else {
                if(!deque.isEmpty()){
                    int top=deque.peek();
                    if(top==1){
                        sb.append(ch=='+'?'-':'+');
                    }
                    else{
                        sb.append(ch);
                    }
                }
            }

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
