import java.util.ArrayDeque;
import java.util.Deque;

public class test {
    public static void main(String[] args) {
        Deque<Integer> deque= new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.offer(3));
        System.out.println(deque.peek());
    }
}
