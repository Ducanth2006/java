package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class demSoDauNgoacDoiChieu {
    private static int solve(char []x){
        Deque<Character> deque =new ArrayDeque<>();
        // vòng lăp đầu tiên để tìm các () hợp lệ trong đầu bài
        deque.offerLast(x[0]);
        for(int i=1;i<x.length;i++){
            if(x[i]=='(' && deque.peekLast()==')'){
                deque.pollLast();
            }
            if(x[i]==')' && deque.peekLast()=='('){
                deque.pollLast();
            }

        }

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<test;i++){
            char [] arr=(sc.nextLine()).toCharArray();
        }

    }
}
