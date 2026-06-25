package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bienDoiTienToHauTo {
    private static final Deque<String> deque= new ArrayDeque<>();
    private static void solve(char[] arr){
        deque.clear();
        for(int i=arr.length-1;i>-1;i--){
            char ch= arr[i];
            if(ch=='*'||ch=='+'||ch=='-'||ch=='/'){
                if(!deque.isEmpty()){
                    String x1=deque.pop();
                    String x2= deque.pop();
                    deque.push(x1+x2+ch);
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
            char [] arrCh= sc.next().toCharArray();
            solve(arrCh);

        }
    }
}
