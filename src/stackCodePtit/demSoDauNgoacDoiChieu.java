package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;
// nhớ là duyệt ngược nhé nhớ nhé
public class demSoDauNgoacDoiChieu {
    private static int solve(char []x){
        Deque<Character> deque =new ArrayDeque<>();
        // vòng lăp đầu tiên để tìm các () hợp lệ trong đầu bài


        for(int i=0;i<x.length;i++){
            // vòng if đầu tiên kiểm tra xem cuối mảng deque có phải là ( và x[i] có bằng ) để tạo thành() ko
            if(!deque.isEmpty()&&(x[i]==')' && deque.peekLast()=='(')){
                deque.pollLast();
            }
            // nếu ko phải cặp hợp lệ ta vẫn phải push nó vào
            else{
                if(!deque.isEmpty()){
                    deque.offerLast(x[i]);
                }
                // đây là xử lý trường hợp đầu tiên tức i=0;
                else{
                    deque.offerLast(x[i]);
                }
            }

        }
        // sau vòng for này deque sẽ chỉ còn lại các ngoặc ko thỏa mãn tức cần phải thay đổi
        int m=0;
        int n=0;
        for(char y:deque){
            if(y==')'){
                m++;
            }
            if(y=='('){
                n++;
            }
        }
        System.out.println(deque);
        // ta sẽ đổi theo công thức 2 (( =phải đảo 1 lần , 2)) phải đạo một lần nhưng )( phải đảo 2 lần
        // vì vậy +1 chia 2 để lấy số cặp
        return ((m+1)/2)+((n+1)/2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<test;i++){
            char [] arr=(sc.nextLine()).toCharArray();
            System.out.println(solve(arr));
        }


    }
}
