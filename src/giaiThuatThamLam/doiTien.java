package giaiThuatThamLam;

import java.util.Scanner;

public class doiTien {
    private static int [] faceValue= new int[]{1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int t=0;t<test;t++){
            int money=sc.nextInt();
            int count=0;
            for(int i=0;i< faceValue.length;i++){
                if(money==0) break;
                count+=money/faceValue[i];
                money%=faceValue[i];
            }
            System.out.println(count);
        }
    }
}
