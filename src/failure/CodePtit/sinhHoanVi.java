package failure.CodePtit;

import java.util.Scanner;

public class sinhHoanVi {
    public static boolean sinhHoanViKeTiep(int[]a){
        int n=a.length;
        int k=-1;
        for(int i=n-2;i>-1;i--){
            if(a[i]<a[i+1]){
                k=i;
                break;
            }
        }
        if(k==-1) return false;
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
        int left=k+1;
        int right=n-1;
        while(left<right){
            int t=a[left];
            a[left]=a[right];
            a[right]=t;
            left++;right--;
        }
        return true;
    }
    private static boolean checkMangGiongNhau(int [] a,int [] b){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int [] mangInit= new int[n];
            for(int i=0;i<n;i++){
                mangInit[i]=sc.nextInt();
            }
            int [] mang=new int[n];
            int tam=1;
            for(int i=0;i<n;i++){
                mang[i]=tam;
                tam++;
            }
            int stt=0;
            while(true){
                stt++;

                if(checkMangGiongNhau(mangInit,mang)){
                    System.out.println(stt);
                    break;
                }

                if(!sinhHoanViKeTiep(mang)){
                    break;
                }
            }

        }
    }
}
