package bttrenlop;

import java.util.Scanner;

public class sinhToHop {
    public static boolean sinhTopHopFunction(int [] a,int k,int n){
        int i=k-1;
        while(i>=0&&a[i]==n-k+i+1){
            i--;
        }
        if(i<0){
            return false;
        }
        a[i]+=1;
        for(int j=i+1;j<k;j++){
            a[j]=a[j-1]+1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] mang=new int[k];
            for(int j=1;j<=k;j++){
                mang[j-1]=j;
            }
            do {
                for (int g : mang) {
                    System.out.print(g);
                }
                System.out.print(" ");
            } while (sinhTopHopFunction(mang, k, n));
            System.out.println();



        }

}}

