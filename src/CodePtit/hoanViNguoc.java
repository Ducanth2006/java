package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

public class hoanViNguoc {
    private static boolean sinhHoanVi(int [] a){
        int n=a.length;
        int k=-1;
        for(int i=n-2;i>-1;i--){
            if(a[i]>a[i+1]){
                k=i;
                break;
            }
        }
        if(k==-1) return false;
        int l=-1;
        for(int j=n-1;j>k;j--){
            if(a[j]<a[k]){
                l=j;
                break;
            }
        }
        int temp=a[k];
        a[k]=a[l];
        a[l]=temp;
        int left=k+1;
        int right=n-1;
        while(left<right){
            int gan=a[left];
            a[left]=a[right];
            a[right]=gan;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int [] mang=new int[n];
            int tam=n;
            for(int i=0;i<n;i++){
                mang[i]=tam;
                tam--;
            }
            while(true){
                for(int i:mang){
                    System.out.print(i);
                }
                System.out.print(" ");
                if(!sinhHoanVi(mang)){
                    break;
                }
            }
            System.out.println();


        }
    }

}
