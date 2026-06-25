package failure.Review;

import java.util.Scanner;

public class reviewSinhNhiPhan {
    private static int n;
    private static int []arr;
    private static void print(){
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    private static void bt(int i){
        for(int j=0;j<=1;j++){
            arr[i]=j;
            if(i==n){
                print();
            }
            else{
                bt(i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            arr=new int[n+1];
            bt(1);
        }
    }
}
