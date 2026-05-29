package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bienDoiTienToHauTo {
    private static String solve(char[] arr){
        Deque<String> deque= new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='*'||arr[i]=='+'||arr[i]=='-'||arr[i]=='/'){
                if(!deque.isEmpty()){
                    deque.push(String.format("%s%s%c",deque.pop(),deque.pop(),arr[i]));
                }
            }
            else{
                deque.push(String.valueOf(arr[i]));
            }
        }
        return deque.pop();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            char[] arr=(sc.nextLine()).toCharArray();
            System.out.println(solve(arr));
        }
    }
}
