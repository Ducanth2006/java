package CodePtit;

import java.util.Scanner;

public class sinhXauNhiPhanKeTiep {
    public static int[] sinh(int[] a){
        int i=a.length-1;
        while(i>=0&&a[i]==1){
            a[i]=0;
            i--;
        };
        if(i<0){
            return a;
        }
        a[i]=1;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<test;i++){
            String input=sc.nextLine();
            int[] arr = new int[input.length()];

            for (int k = 0; k < input.length(); k++) {
                // Trừ đi ký tự '0' để lấy giá trị số nguyên tương ứng
                arr[k] = input.charAt(k) - '0';
            }
            String result="";
            for(int h:sinh(arr)){
                System.out.print(h);
            }
            System.out.println();

        }
    }
}
