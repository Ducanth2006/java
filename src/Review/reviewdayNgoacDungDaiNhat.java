package Review;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class reviewdayNgoacDungDaiNhat {
    private static final  Deque<Integer> deque= new ArrayDeque<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char []ch=(sc.next()).toCharArray();
            solve(ch);
        }
    }
    private static void solve(char [] ch){
        deque.clear();
        deque.push(-1);
        int peer=0;
        int res=0;
        for(int i=0;i<ch.length;i++){
            char cur= ch[i];
            if(cur=='('){
                deque.push(i);
            }
            else{
                if(!deque.isEmpty()){
                    deque.pop();
                    if(deque.isEmpty()){
                        deque.push(i);
                    }
                    else{
                        peer=i-deque.peek();
                        if(peer>res){
                            res=peer;
                        }
                    }

                }
            }
        }
        System.out.println(res);

    }
}
