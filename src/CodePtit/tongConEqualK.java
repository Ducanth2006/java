package CodePtit;

import java.util.*;

public class tongConEqualK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] mang=new int[n];
        for(int i=0;i<n;i++){
            mang[i]=sc.nextInt();
        }
        Arrays.sort(mang);
    }

}
//tle bài này hẹn khi học backtrack t sẽ quay lại vs mày
