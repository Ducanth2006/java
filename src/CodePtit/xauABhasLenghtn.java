package CodePtit;

import java.util.Arrays;
import java.util.Scanner;

public class xauABhasLenghtn {
    public static boolean sinhDayAB(char[] mangChar){
        int i=mangChar.length-1;
        while(i>=0&&mangChar[i]=='B'){
            mangChar[i]='A';
            i--;
        }
        if(i<0) return false;
        mangChar[i]='B';
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();

        for(int i=0;i<test;i++){
            int n=sc.nextInt();
            char[] mangChar= new char[n];
            Arrays.fill(mangChar, 'A');
            while(true){
                System.out.print(String.valueOf(mangChar)+" ");
                if(!sinhDayAB(mangChar)){
                    break;
                }

            }
            System.out.println();

        }
    }
}
