package queuCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class diChuyenMaTran {
     static class Node{
        int r,c,step;
        public Node(int r,int c,int step){
            this.r=r;
            this.c=c;
            this.step=step;
        }
    }
    private static final Deque<Node> deque= new ArrayDeque<>();
    private static void solve(int m,int n,int [][]arr){
        deque.clear();
        boolean [][] visited= new boolean[m+1][n+1];
        deque.offer(new Node(1, 1, 0));
        visited[1][1]=true;
        while(!deque.isEmpty()){

        }


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t -->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[][] arr=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

        }
    }
}
