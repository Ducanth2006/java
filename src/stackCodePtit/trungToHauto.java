package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class trungToHauto {
    private static boolean isOper(String x){
        return (x.equals("*")||x.equals("+")||x.equals("-")||x.equals("/")||x.equals("^"));
    }
    private static int compare(String x){
        if(x.equals("^")) return 3;
        else if(x.equals("*")||x.equals("/")) return 2;
        else if (x.equals("+") || x.equals("-")) return 1;
        return 0;
    }

    private static String solve(String []arr){
        Deque<String> deque= new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        for(String x:arr){
            if(!isOper(x)&&!x.equals(")")&&!x.equals("(")) sb.append(x);
            else if(x.equals("(")) deque.push(x);
            else if(x.equals(")")) {
                while(!deque.isEmpty()&&!deque.peek().equals("(")){
                    sb.append(deque.pop());
                }
                deque.pop();
            }
            else {
                while(!deque.isEmpty()&&compare(deque.peek())>=compare(x)){
                    sb.append(deque.pop());
                }
                deque.push(x);
            }
        }
        while(!deque.isEmpty()){
            sb.append(deque.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            String []arr=(sc.nextLine()).trim().split("");
            System.out.println(solve(arr));

        }
    }
}
