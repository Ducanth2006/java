import java.util.*;

public class test {
    public static void main(String[] args) {
        Deque<Integer> stack= new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
        // dùng với stack
        // lấy ra dùng pop và peek
        System.out.println(stack.peek());// kỳ vọng ra 1
        Stack<Integer> stackReal= new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stackReal);
        System.out.println(stack.peek());// kỳ vọng ra 2
        Queue<Integer> queue1=new ArrayDeque<>();
        queue1.offer(1);
        queue1.offer(2);
        System.out.println(queue1);
        System.out.println(queue1.peek());// kỳ vọng ra 1


    }
}
