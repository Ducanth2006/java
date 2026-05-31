package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class dayNgoacDung {
    private static String solve(String []arr){
        if(arr.length==0){
            return "Yes";
        }
        Deque<String> deque= new ArrayDeque<>();
        for(String x:arr){
            if (x.equals(")") || x.equals("]") || x.equals("}")){
                if(deque.isEmpty()){
                    return "No";
                }
                if(x.equals(")")&&deque.peek().equals("(")) deque.pop();
                else if(x.equals("]")&&deque.peek().equals("[")) deque.pop();
                else if(x.equals("}")&&deque.peek().equals("{")) deque.pop();
                else{
                    return "No";
                }
            }
            else{
                deque.push(x);
            }
        }
        return deque.isEmpty()?"Yes":"No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            String []arr= (sc.nextLine()).trim().split("");
            System.out.println(solve(arr));
        }
    }
}
