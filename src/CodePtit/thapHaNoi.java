package CodePtit;

import java.util.Scanner;

public class thapHaNoi {
    private static void solveHanoi(int n, char source,char aux,char target){
        if(n==1){
            System.out.println(source+" -> "+target);
            return;
        }
        solveHanoi(n-1,source,target,aux);
        System.out.println(source+" -> "+target);
        solveHanoi(n-1,aux,source,target);

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        solveHanoi(n,'A','B','C');
    }

}
