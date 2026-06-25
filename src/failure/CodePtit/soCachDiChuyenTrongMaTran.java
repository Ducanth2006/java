package failure.CodePtit;

import java.util.Scanner;

public class soCachDiChuyenTrongMaTran {
    private static int sum;
    private static void bt(int [][]mangDb,int m,int n,int r,int c){
        if(r==m-1&&c==n-1){
            sum++;
            return ;
        }
        if(r+1<m){
            bt(mangDb,m,n,r+1,c);
        }
        if(c+1<n){
            bt(mangDb,m,n,r,c+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int [][] mangDb=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    mangDb[i][j]=sc.nextInt();
                }
            }
            sum=0;
            bt(mangDb,m,n,0,0);
            System.out.println(sum);
            sum=0;


        }
    }
}
