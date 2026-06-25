package failure.Review;

import java.util.Scanner;

public class reviewToHopBt {
    private static int n,k;
    private static int []arr;
    private static void print(){
        for(int i=1;i<=k;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    private static void bt(int i){
        for(int j=arr[i-1]+1;j<=n-k+i;j++){
            arr[i]=j;
            if(i==k){
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
            k=sc.nextInt();
            arr= new int[k+1];
            bt(1);
        }
    }

}
