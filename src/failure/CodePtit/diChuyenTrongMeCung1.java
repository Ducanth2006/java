package failure.CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

public class diChuyenTrongMeCung1 {
    static ArrayList<String> ketQua=new ArrayList<>();
    private static void moveBt(int [][] mang,int n,int row,int col,String path){
        if(row==n-1&&col==n-1){
            ketQua.add(path);
            return ;
        }
        if(row+1<n&&mang[row+1][col]==1){
            moveBt(mang,n,row+1,col,path+"D");
        }
        if(col+1<n&&mang[row][col+1]==1){
            moveBt(mang,n,row,col+1,path+"R");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test =sc.nextInt();
        for(int t=0;t<test;t++){
            int n =sc.nextInt();
            int [][] mang = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mang[i][j]=sc.nextInt();
                }
            }
            String s="";
            if(mang[0][0]==0){
                System.out.println(-1);
                continue;
            }
            moveBt(mang,n,0,0,s);
            if(ketQua.isEmpty()) {
                System.out.println(-1);
            }

            else{
                for(int i=0;i<ketQua.size();i++){
                    System.out.print(ketQua.get(i));
                    if(i<ketQua.size()-1) System.out.print(" ");
                }
            }
            System.out.println();
            ketQua.clear();

        }


    }
}
