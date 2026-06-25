package failure.CodePtit;

import java.util.Scanner;

public class sttToHop {
    private static boolean sinhToHop(int [] a,int n,int k){
        int i=k-1;
        while(i>=0 &&a[i]==n-k+i+1){
            i--;
        }
        if(i<0) return false;
        a[i]++;
        for(int j=i+1;j<k;j++){
            a[j]=a[i]+j-i;
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
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] mangInit= new int[k];
            int [] mang=new int[k];

            for(int i=0;i<k;i++){
                mangInit[i]=sc.nextInt();
            }
            int dem=1;
            for(int i=0;i<k;i++){
                mang[i]=dem;
                dem++;
            }
            int stt=0;
            while(true){
                stt++;
                if(checkMangGiongNhau(mang,mangInit)){
                    System.out.println(stt);
                    break;
                }
                if(!sinhToHop(mang,n,k)){
                    break;
                }

            }

        }
    }
}
