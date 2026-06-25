package failure.queuCodePtit;

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
        int res=-1;
        while(!deque.isEmpty()){
            Node current=deque.poll();
            int r= current.r;
            int c= current.c;
            int step= current.step;
            // có 2 điều kiện dừng :khi chạm đích , 2 là khi gặp 0 thì dừng loang cái đó lại

            if(arr[r][c]==0){
                continue;
            }
            if(r==m&&c==n){
                res=step;
                break;

            }
            int spreadCol=c+arr[r][c];
            int spreadRow=r+arr[r][c];
            if(spreadCol<=n&&!visited[r][spreadCol]){
                visited[r][spreadCol]=true;
                deque.offer(new Node(r,spreadCol,step+1));

            }
            if(spreadRow<=m&&!visited[spreadRow][c]){
                visited[spreadRow][c]=true;
                deque.offer(new Node(spreadRow,c,step+1));
            }

        }
        System.out.println(res);



    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t -->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[][] arr=new int[m+1][n+1];
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            solve(m,n,arr);

        }
    }
}
