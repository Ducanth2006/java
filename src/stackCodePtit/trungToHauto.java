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
