import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] mangtam=new int[n*2];
        // cách hay hơn này dùng System.arraycopy(nums,0,mangtam,0,n)
        // n là Số lượng phần tử hay số lượng phần tử sẽ bị copy
        // tiếp tục System.arraycopy(nums,0,mangtam,n,n) khi này sẽ bắt đầu từ index thứ n của
//        mamtam có tổng index là n*2 , và tiếp tục tạo ra concatenation array
        for(int i=0;i<n;i++){
            mangtam[i]=nums[i];
        }
        for(int i=n;(i<2*n);i++){
            mangtam[i]=nums[i-n];
        }
        return mangtam;
    }
}
public class b1929 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] mang=new int[n];
        for(int i=0;i<n;i++){
            mang[i]=sc.nextInt();
        }
//        System.out.println(Arrays.toString(mang));
        Solution s= new Solution();

        int[] ans= s.getConcatenation(mang);
        System.out.println(Arrays.toString(ans));

    }
}
