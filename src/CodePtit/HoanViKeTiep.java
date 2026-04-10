package CodePtit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HoanViKeTiep {
    public static int [] sinhHoaViKeTiepBT(int []a){
        int n=a.length;
        int k=-1;
        for(int i=n-2;i>-1;i--){
            if(a[i]<a[i+1]){
                k=i;
                break;
            }
        }
        if (k==-1) return a;
        int l=-1;
        for(int j=n-1;j>k;j--){
            if(a[k]<a[j]){
                l=j;
                break;
            }
        }
        int temp=a[k];
        a[k]=a[l];
        a[l]=temp;
        int left=k+1;int right=n-1;
        while(left<right){
            int t=a[left];
            a[left]=a[right];
            a[right]=t;
            left++;right--;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int n=sc.nextInt();
            int []mang=new int[n];
            for(int k=0;k<n;k++){
                mang[k]=sc.nextInt();
            }
            for(int k:sinhHoaViKeTiepBT(mang)){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
