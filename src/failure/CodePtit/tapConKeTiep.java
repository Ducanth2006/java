package failure.CodePtit;

import java.util.Scanner;

public class tapConKeTiep {
    public static int[] sinhToHopKeTiep(int []a,int n,int k){
        int i=k-1;
        while(i>=0&&a[i]==n-k+i+1){
            i--;
        }
        if(i<0) return a;
        a[i]++;
        for(int j=i+1;j<k;j++){
            a[j]=a[i]+j-i;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();
        for(int i=1;i<=test;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] a =new int[k];
            sc.nextLine();
            for(int e=0;e<k;e++){
                a[e]=sc.nextInt();
            }
            for(int x:sinhToHopKeTiep(a, n, k)){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
