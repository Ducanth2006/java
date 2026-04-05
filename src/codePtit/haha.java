package codePtit;

import java.util.Scanner;

public class haha {
    public static boolean sinhHaha(char []mang){
        int n=mang.length;
        int i=n-2;
        while(i>=0&&mang[i]=='A'){
            i--;
        }
        if(i<0){
            return false;
        }
        mang[i]='H';
        for (int j = i + 1; j < n-1; j++) {
            mang[j] = 'A';
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int n=sc.nextInt();
            char [] mangChar= new char[n];
            mangChar[0]='H';
            for(int h=1;h<n;h++)
            while(true){
                System.out.println(String.valueOf(mangChar));
                if(!sinhHaha(mangChar)){
                    break;
                }
            }

        }

    }


}
