package failure.CodePtit;

import java.util.Scanner;

public class haha {
    public static boolean checkHLienTuc(char[]mang){
        for(int i=0;i<mang.length-1;i++){
            if(mang[i]=='H'&&mang[i+1]=='H'){
                return false;
            }
        }
        return true;
    }

    public static boolean sinhHaha(char []mang){
        int n=mang.length;
        int i=n-2;
        while(i>=1&&mang[i]=='H'){
            mang[i]='A';
            i--;
        }
        if(i<1){
            return false;
        }
        mang[i]='H';

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int n=sc.nextInt();
            char [] mangChar= new char[n];
            mangChar[0]='H';
            for(int h=1;h<n-1;h++){
                mangChar[h]='A';
            }
            mangChar[n-1]='A';
            while(true){
                if(checkHLienTuc(mangChar)){
                    System.out.println(String.valueOf(mangChar));

                }
                if(!sinhHaha(mangChar)){
                    break;
                }
            }

        }

    }


}
