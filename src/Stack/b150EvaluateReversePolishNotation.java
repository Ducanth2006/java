package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class b150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1){
             return Integer.parseInt(tokens[0]);
        }
        if(tokens.length==0){
            return 0;
        }
        Deque<Integer> stack= new ArrayDeque<>();
        for(String x:tokens){
            switch(x){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    int second1=stack.pop();
                    int first1=stack.pop();
                    stack.push(first1-second1);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    int second=stack.pop();
                    int first=stack.pop();
                    stack.push(first/second);
                    break;
                default :
                    stack.push(Integer.parseInt(x));
            }
        }
        return stack.pop();


    }

}
// nếu tìm thấy operation thì sẽ sử dụng với hai thằng đằng sau , nếu tiếp tục lại là operation tiếp thì sẽ lấy thằng
//Thứ 3 để tính công thức của 2 thằng đó nhé