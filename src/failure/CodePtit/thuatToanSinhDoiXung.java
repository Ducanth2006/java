package failure.CodePtit;

import java.util.Scanner;

public class thuatToanSinhDoiXung {
    static int n;
    static int[] a;
    static boolean checkDoiXung(int [] n){
        int right=n.length-1;
        for(int k=0;k<n.length/2;k++){
            if(n[k]!=n[right]){
                return false;
            }
            right--;

        }
        return true;
    }
    static void sinhDoiXung(int i){
        for(int j=0;j<=1;j++){
            a[i]=j;
            if(i==n-1){
                if(checkDoiXung(a)){
                    for(int h:a){
                        System.out.print(h+" ");
                    }
                    System.out.println();
                }

            }
            else{
                sinhDoiXung(i+1);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        // Khởi tạo mảng có độ dài n
        a = new int[n];

        // Bắt đầu quay lui từ vị trí 0
        sinhDoiXung(0);
    }
}
