package failure.Review;

import java.util.Scanner;

public class reviewThapHaNoi {
    private static void solveHaNoi(int n,char source,char aux,char target){
        if(n==1){
            System.out.println(source+" -> "+target);
            return;
        }
        solveHaNoi(n-1,source,target,aux);
        System.out.println(source+" -> "+target);
        solveHaNoi(n-1,aux,source,target);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        solveHaNoi(n,'A','B','C');

    }
}
