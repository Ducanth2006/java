package stackCodePtit;

import java.util.Scanner;

public class daoTu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            String [] arr=(sc.nextLine()).trim().split(" ");
            for(int x=arr.length-1;x>-1;x--){
                System.out.print(arr[x]+" ");
            }
            System.out.println();
        }
    }
}
