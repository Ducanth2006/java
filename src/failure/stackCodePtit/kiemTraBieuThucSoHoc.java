package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class kiemTraBieuThucSoHoc {
    private static String solve(char [] arr){
        Deque<Character> deque= new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==')'){
                char top=deque.pollLast();
                boolean hasOperator=false;
                while(top!='('){
                    if(top=='+'||top=='-'||top=='*'||top=='/'){
                        hasOperator=true;
                    }
                    if(!deque.isEmpty()){
                        top=deque.pollLast();
                    }
                    else{
                        break;
                    }

                }
                if(!hasOperator){
                    return "Yes";
                }
            }
            else{
                if(arr[i]=='('||arr[i]=='+'||arr[i]=='-'||arr[i]=='*'||arr[i]=='/'){
                    deque.offerLast(arr[i]);
                }
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            char [] arrChar= (sc.nextLine()).toCharArray();
            System.out.println(solve(arrChar));

        }
    }
}
