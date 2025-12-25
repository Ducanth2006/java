package A_code_a_day;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class chuan_hoa_ten_1 {
    public static String edit(String x){
        x.toLowerCase();
        String s=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase();
        return s;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<test;i++){
            String name=sc.nextLine().trim();
            String []mang=name.split("\\s+");
            for (String tu : mang) {
                System.out.print(edit(tu) + " ");
            }
            System.out.println();

        }
    }
}
