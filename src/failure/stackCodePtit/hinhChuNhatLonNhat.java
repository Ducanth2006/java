package failure.stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class hinhChuNhatLonNhat {
    private static final Deque<Integer> deque= new ArrayDeque<>();
    private static long solve(long []arr,int n){

        long maxArea=0;
        for(int i=0;i<=n;i++){
            while(!deque.isEmpty()&&arr[deque.peek()]>arr[i]){
                int top=deque.pop();
                long height=arr[top];
                long width;
                if(deque.isEmpty()){
                    width=i;
                }
                else{
                    int leftIndex=deque.peek();
                    width=i-leftIndex-1;

                }
                maxArea= Math.max(maxArea,width*height);

            }
            deque.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            long []arr= new long[n+1];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            arr[n]=0;// đặc trị bọn tăng dần ko có giảm nhé ví dụ 1 2 3 4 nhưng có cuối là 0 thì sẽ vào while thôi
            System.out.println(solve(arr,n));
        }
    }
}
// bài là tìm diện tích tức tìm chiều dài với chiều rộng nhé , tôi tư duy là height tôi có thể truy cập được qua index , vậy deque tôi sẽ lưu index tức chiều rộng
// ví dụ là 1 4 5 6 2 đi , nó sẽ lặp đến index =4 với arr[4]=2  nó sẽ nhảy vào while
// while 1 nó pop và set top =3, height=6 , nó nhảy vào else left index =2 vậy cập nhật là width = 4-2-1=1 ,area=1*6
// while 2 nó pop và set top =2 , height=5 , nó nhảy vào else left index =1 vậy cập nhật width =4-1-1, area=2*5=10
//while 3 nó pop và set top =1 , height =4, nó nhảy vào else left indẽx =0 , vây width =4-0-1=3 , area =4*3 bằng 12 cập nhật max
// push 4 vào mảng [0,4]