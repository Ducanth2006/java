package Review;

import java.util.ArrayList;
import java.util.Scanner;

public class diChuyenMeCungReview {
    static ArrayList<String> result= new ArrayList<>();
    private static void bt(int [][]mang2Chieu,int n,int row,int col,String x){
        if(row==n-1&&col==n-1){
            result.add(x);
            return;
        }
        if(row+1<n&&mang2Chieu[row+1][col]==1){
            bt(mang2Chieu,n,row+1,col,x+"D");
        }
        if(col+1<n&&mang2Chieu[row][col+1]==1){
            bt(mang2Chieu,n,row,col+1,x+"R");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++){
            int n= sc.nextInt();
            int [][] mang2Chieu= new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mang2Chieu[i][j]=sc.nextInt();
                }
            }
            String x="";
            if(mang2Chieu[0][0]==0){
                System.out.println(-1);
                continue;
            }
            bt(mang2Chieu,n,0,0,x);
            for(String k:result){
                System.out.println(k);
            }
        }

    }
}
// sau khi review lại thì tôi thấy mảng này ko cần đánh dấu bởi vì nó