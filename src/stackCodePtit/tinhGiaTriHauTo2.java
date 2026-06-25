package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class tinhGiaTriHauTo2 {
    private static long solve(String [] arr){
        Deque<Long> deque= new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("+")||arr[i].equals("-")||arr[i].equals("*")||arr[i].equals("/")){
                if(!deque.isEmpty()){
                    if(arr[i].equals("+")){
                        deque.push(deque.pop()+deque.pop());
                    }
                    else if(arr[i].equals("-")){
                        Long a=deque.pop();
                        Long b=deque.pop();
                        deque.push(b-a);
                    }
                    else if(arr[i].equals("*")){
                        deque.push(deque.pop()*deque.pop());
                    }
                    else {
                        Long a=deque.pop();
                        Long b=deque.pop();
                        deque.push(b/a);
                    }
                }
            }
            else{
                deque.push(Long.parseLong(arr[i]));
            }
        }
        return deque.pop();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            sc.nextLine();
            String [] arr= new String[n];
            for(int k=0;k<n;k++){
                arr[k]=sc.next();
            }
            System.out.println(solve(arr));

        }
    }
}
