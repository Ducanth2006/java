package OnTuBtSinh.nhiPhan;

import java.util.Scanner;

public class sinhDayNgoacHopLe {
    static int n;
    private static void sinh(int open,int close,String x){
        if(x.length()==n*2){
            System.out.println(x);
        }
        if(open<n){
            sinh(open+1,close,x+'(');
        }
        // điều kiẹn tỉa bỏ mới phần ko hợp lệ đây
        if(close<open){
            sinh(open,close+1,x+')');
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sinh(0,0,"");
    }
}
