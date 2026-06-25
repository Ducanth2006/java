package failure.CodePtit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class toHopTiepTheo {
    public static int tinhSoMoi(int n,int k,int []a){
        int sum=0;
        int i=k-1;
        Set<Integer> set0=new HashSet<>();
        for(int h=0;h<k;h++){
            set0.add(a[h]);
        }
        while (i >=0 && a[i] == n - k + i+1) {
            i--;
        }
        // Nếu i == 0 tức là đã sinh xong tổ hợp cuối cùng
        if (i < 0) return k;
        // Tăng giá trị tại vị trí i lên 1
        a[i]++;
        // Các vị trí sau i sẽ bằng giá trị đứng trước nó + 1
        for (int j = i + 1; j < k; j++) {
            a[j] = a[i] + j - i;
        }
        for(int g=0;g<k;g++){
            if(!set0.contains(a[g])){
                sum++;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int h=0;h<test;h++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            int []a= new int[k];
            for (int i = 0; i < k; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println(tinhSoMoi(n,k,a));



        }

    }


}