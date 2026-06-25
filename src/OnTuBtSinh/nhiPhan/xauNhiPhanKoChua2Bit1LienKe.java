package OnTuBtSinh.nhiPhan;

import java.util.Scanner;

public class xauNhiPhanKoChua2Bit1LienKe {
    static int n;
    static int []X;
    private static void print(){
        for(int i=1;i<=n;i++){
            System.out.print(X[i]);
        }
        System.out.println();
    }
    private static void sinhBt(int i){
        for(int j=0;j<=1;j++){
            if(i>1&&j==1&&X[i-1]==1){
                continue;
            }
            X[i]=j;
            if(i==n){
                print();
            }
            else{
                sinhBt(i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        X= new int[n+1];
        sinhBt(1);

    }
}
