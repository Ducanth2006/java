package queuCodePtit;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class diChuyenRobot {
    private static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    private static class Node{
        int x,y,step;
        Node(int x,int y,int step){
            this.x=x;
            this.y=y;
            this.step=step;
        }
    }
    static final int []dx= new int[]{-1,-1,-1,0,0,1,1,1};
    static final int []dy= new int[]{-1,0,1,-1,1,-1,0,1};
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        while(test -->0){
            int xA=sc.nextInt();
            int yA=sc.nextInt();
            int xB=sc.nextInt();
            int yB=sc.nextInt();
            int n=sc.nextInt();
            HashSet<Pair> set= new HashSet<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                int y1=sc.nextInt();
                int y2=sc.nextInt();
                for(int j=y1;j<=y2;j++){
                    set.add(new Pair(x,j));
                }
            }

        }
    }


}
