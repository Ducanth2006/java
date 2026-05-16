package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tongConBangKReview {
    static private boolean check;
    private static void printMang(ArrayList<Integer> mang){

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int targetSum=sc.nextInt();
            int [] mang=new int[n];
            for(int i=0;i<n;i++){
                mang[i]=sc.nextInt();
            }
            Arrays.sort(mang);
            check=false;


        }
    }
}
