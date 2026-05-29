package stackCodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bienDoiTienToTrungTo {
    private static String solve(char[] arr){
        Deque<String> deque= new ArrayDeque<>();
        // Tiền tố (Prefix): Toán tử đứng trước, các toán hạng đứng sau. Ví dụ: + A B nghĩa là toán tử + áp dụng cho A và B.
        // Trung tố (Infix): Toán tử nằm ở giữa hai toán hạng và được bao quanh bởi dấu ngoặc. Ví dụ tương ứng: (A + B)
        //Bản chất của tiền tố là cấu trúc cây. Để chuyển đổi một cách tự nhiên nhất, chúng ta thường chọn duyệt từ phải qua trái (từ cuối chuỗi về đầu chuỗi).
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]=='*'||arr[i]=='+'||arr[i]=='-'||arr[i]=='/'){
                if(!deque.isEmpty()){
                    deque.push(String.format("(%s%c%s)",deque.pop(),arr[i],deque.pop()));
                }
            }
            else{
                    deque.push(String.valueOf(arr[i]));
            }
        }
        // test như sau vơis *+AB-CD , sau khi duyệt từ phải sang 2 phần từ thì deque sẽ là D C
        // khi gặp - thì sẽ thực hiện pop C và pop D sau đó nó púsh cái biểu thứ đó vào thàng deque là (C-D)

        return deque.pop();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            char[] arrChar=(sc.nextLine()).toCharArray();
            System.out.println(solve(arrChar));
        }
    }
}
