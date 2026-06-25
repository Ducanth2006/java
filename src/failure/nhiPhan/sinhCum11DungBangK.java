package failure.nhiPhan;

import java.util.Scanner;

public class sinhCum11DungBangK {
    static int n;
    static int []X;
    static int k;
    private static void print(){
        for(int i=1;i<=n;i++){
            System.out.print(X[i]);
        }
        System.out.println();
    }
    private static int check(int []x){
        int sum=0;
        for(int i=1;i<=x.length;i++){
            if(x[i]==1){
                sum++;
            }
        }
        return sum;
    }
    private static void sinhBt(int i){
        for(int j=0;j<=1;j++){
            if(check(X)<=k){
                X[i]=j;
                if(i==n){
                    print();
                }
                else{
                    sinhBt(i+1);
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        X= new int[n+1];
        sinhBt(1);

    }
}
