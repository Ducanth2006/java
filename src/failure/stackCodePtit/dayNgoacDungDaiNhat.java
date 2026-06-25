package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class dayNgoacDungDaiNhat {
    private static int solve(char[]arr){
        Deque<Integer> deque = new ArrayDeque<>();
        int record =0;
        int peer=0;
        deque.push(-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
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
                        if(peer>record){
                            record=peer;
                        }
                    }
                }
            }
        }
        return record;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            char[] arr = (sc.nextLine()).toCharArray();
            System.out.println(solve(arr));

        }
    }

}
