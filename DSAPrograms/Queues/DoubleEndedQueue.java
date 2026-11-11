package DSAPrograms.Queues;


import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Insert elements
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerLast(30);

        System.out.println(dq);  // [10, 20, 30]

        // Insert at front
        dq.offerFirst(5);
        System.out.println(dq);  // [5, 10, 20, 30]

        // Delete elements
        dq.pollFirst();
        System.out.println(dq);  // [10, 20, 30]

        dq.pollLast();
        System.out.println(dq);  // [10, 20]

        // View elements
        System.out.println(dq.peekFirst()); // 10
        System.out.println(dq.peekLast());  // 20
    }
}
