package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reviewTongConBangK {
    static  boolean check;
    private static void bt(int [] mang,int currentSum,int k, ArrayList<Integer> mangKq, int index){
        if( currentSum==k ){
            //ing mangKq
            return;
        }
        for(int i=index;i<mang.length;i++){
            if(currentSum+mang[i]<=k){
                mangKq.add(mang[i]);
                bt(mang,currentSum+mang[i],k,mangKq,index);
                mangKq.remove(mangKq.size()-1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] mang=new int[n];
            for(int i=0;i<n;i++){
                mang[i]=sc.nextInt();
            }
            check=false;
            Arrays.sort(mang);


        }
    }
}
