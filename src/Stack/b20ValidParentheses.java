package Stack;

import java.util.ArrayDeque;

public class b20ValidParentheses {
    public boolean isValid(String s) {
        ArrayDeque<Character> deque= new ArrayDeque<>();
        char [] mang=s.toCharArray();
        for(char x:mang){
            if((x!=')')&&(x!=']')&&(x!='}')){
                deque.push(x);
            }
            else{
                if (deque.isEmpty()) {
                    return false;
                }
                else if(x==')'&&deque.peek()=='('){
                    deque.pop();
                }
                else  if(x==']'&&deque.peek()=='['){
                    deque.pop();
                }
                else  if(x=='}'&&deque.peek()=='{'){
                    deque.pop();
                }
                else{
                    return false;
                }

            }
        }
        return deque.isEmpty();
    }
}
