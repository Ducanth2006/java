package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class tinhGiaTriBieuThucTienTo {
    private static int solve(char[] arr){
        Deque<Integer> deque= new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='*'||arr[i]=='+'||arr[i]=='-'||arr[i]=='/'){
                if(!deque.isEmpty()){
                    if(arr[i]=='*'){
                        deque.push(deque.pop()*deque.pop());
                    }
                    else if(arr[i]=='+'){
                        deque.push(deque.pop()+deque.pop());
                    }
                    else if(arr[i]=='-'){
                        deque.push(deque.pop()-deque.pop());
                    }
                    else{
                        int a= deque.pop();
                        int b=deque.pop();
                        deque.push(a/b);
                    }
                }

            }
            else{
                deque.push(arr[i]-'0');
            }
        }
        return deque.pop();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            char[] arr= (sc.nextLine()).toCharArray();
            System.out.println(solve(arr));

        }
    }
}
