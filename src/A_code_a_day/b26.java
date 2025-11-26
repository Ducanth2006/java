package A_code_a_day;

import java.util.ArrayList;
import java.util.Scanner;

public class b26 {
    public static String check(ArrayList<Long> A){
        int n =A.size();
        for (int i=0;i<n/2;i++){
            // ta cắt đôi mảng duyệt từ thằng A[i]  và thằng A[n-1-i] tức là duyệt từ rìa 2 bên vào trong dần dần
            if (!A.get(i).equals(A.get(n-1-i))){
                return "NO";
            }
        }
        return "YES";

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int testCase= sc.nextInt();
        for (int i =1;i<=testCase;i++){
            int n=sc.nextInt();
            ArrayList<Long> A=new ArrayList<Long>();
            for (int j =0;j<n;j++){
                A.add(sc.nextLong());
            }
            System.out.println(check(A));


        }
    }
}
