package failure.CodePtit;

import java.util.Scanner;

public class sinhToHop {
    private static boolean sinhToHop(int n,int k,int[] a){
        int i=k-1;
        while(i>=0&&a[i]==n-(k-i-1)){
            i--;
        }
        if(i<0) return false;
        a[i]++;
        for(int j=i+1;j<k;j++){
            a[j]=a[i]+j-i;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] mang=new int[k];
            int dem=1;
            for(int i=0;i<k;i++){
                mang[i]=dem;
                dem++;
            }
            while(true){
                for(int h:mang){
                    System.out.print(h);
                }
                System.out.print(" ");
                if(!sinhToHop(n,k,mang)){
                    break;
                }
            }
            System.out.println();
        }
    }

}
