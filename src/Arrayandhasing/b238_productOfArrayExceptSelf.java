package Arrayandhasing;

import java.util.ArrayList;

public class b238_productOfArrayExceptSelf {
    public static int[] productExceptSelfSolutionC1(int[] nums) {
//      Cách 1 brute Force
        int[]ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
//          Lúc đâu tôi sai bởi vì điều j sai do đặt j=i+1 để tôi ko duyệt qua chính nó là bad ideal
//          Bởi vì khi quét đến phần tử thứ 3(index=2) thì nó sẽ ko nhân 2 phần tử trc nó vì j bắt đầu bằng j=i+1 mà
//          Best solution là đặt nó bắt đầu từ đầu và thêm điều kiện (1) để skip chính nó , và vẫn vậy cứ nhân tiếp đầy
//          đủ thôi
            for(int j=0;j<nums.length;j++){
//              Cái điều kiện này khá hay nó sẽ kiểm tra xem để bỏ qua ko nhân chính nó (1)
                if(i==j){
                    continue;
                }
                product *=nums[j];
            }
//          Lỗi này sai rồi nhé vì khi ta lặp j ta sẽ nhân nums[j] tức nums[i] này nhé lên nó sẽ rất to
//          nums[i]=product;
            ans[i]=product;
        }
        return nums;

    }
//  Cách 1 làm tôi quá chậm ko chạy hết test case cần cách khác tối ưu hơn
//
    public int[] productExceptSelfSolutionC2(int []nums){
        int n=nums.length;
        int [] ans=new int[n];
        int []pre=new int[n];
        pre[0]=1;
        int []suff=new int[n];
        suff[n-1]=1;
//      Phần này khá hay pre phải - bởi vì nó sẽ ko lấy thawngf final bởi vì làm j có thằng nó sau cả sau thằng cuối dko
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
//      Phần này cũng vậy; tôi xử lý vì ko lấy thằng ở đầu bởi vì tôi làm j cos thằng nào trc cả thằng đầu tiên dko
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=pre[i]*suff[i];
        }
        return ans;
//      Về bản chất ta tính pre[i] bằng tích các số trc i tức là [1,2,3,4] pre[2] bằng tích của 1,2 thôi nhé hiểu chưa
//      Khi đó ans[2] bằng tích của 1 và 2 , và tích sau là suff[3=n-1]*nums[2+1]=4 suy ra ans[2]=2*4 oke chưa
    }
}
