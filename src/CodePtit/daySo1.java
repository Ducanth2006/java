package CodePtit;

import java.util.Arrays;
import java.util.Scanner;

public class daySo1 {
    static void inMangTheoDb(int [] mang){
        System.out.print("[");
        for(int i =0;i<mang.length;i++){
            System.out.print(mang[i]);
            if(i<mang.length-1){
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
    static void sinhDaySoBT(int [] mang){
        if(mang.length==1){
            inMangTheoDb(mang);

            return;
        }
        inMangTheoDb(mang);

        int [] nextArr=new int[mang.length-1];
        // do i i<nextArr.length nên sẽ ko có lỗi outOfBound
        for(int i=0;i<nextArr.length;i++){
            nextArr[i]=mang[i]+mang[i+1];// vì ta sử dụng mang chứ ko phải next mảng nữa nhé
        }
        sinhDaySoBT(nextArr);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test =sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int [] mang= new int[n];
            for(int i=0;i<n;i++){
                mang[i]=sc.nextInt();
            }
            sinhDaySoBT(mang);


        }
    }
}
