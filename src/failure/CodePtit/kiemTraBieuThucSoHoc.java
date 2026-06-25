package failure.CodePtit;

import java.util.ArrayDeque;
import java.util.Deque;

public class kiemTraBieuThucSoHoc {
    public static String checkBieuThuc(String s){
        Deque<Character> ds= new ArrayDeque<>();
        for(char x:s.toCharArray()){
            if(x==')'){
                boolean hasOperator=false;
                while(!ds.isEmpty()&&ds.peek()!='('){
                    char charCurrent=ds.pop();
                    if(charCurrent=='+'||charCurrent=='-'||charCurrent=='/'||charCurrent=='*'){
                        hasOperator=true;
                    }

                }
                // nếu mà cái ) nó ko có return ấy thì loại bỏ nó luôn
                if(!ds.isEmpty()){
                    ds.pop();
                }
                if(!hasOperator){
                    return "Yes";
                }

            }
            // chưa phải cuối cứ push vào đã push để bắt đầu kiểm tra
            else{
                ds.push(x);
            }
        }
        return "No";

    }
}
