package A_code_a_day;

import java.util.Scanner;

public class diachiemail {
    public static String getStart(String x){
        String s = x.substring(0,1);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test =sc.nextInt();
        sc.nextLine();
        for (int i =0;i<test;i++){
            String s=sc.nextLine().trim().toLowerCase();
            String [] mang =s.split("\\s+");
            int n=mang.length;
            String mainName= mang[n-1];
            String hodem="";
            for (int j=0;j<n-1;j++){
                hodem+=getStart(mang[j]);
            }
            System.out.println(mainName+hodem+"@ptit.edu.vn");

        }
    }
}
