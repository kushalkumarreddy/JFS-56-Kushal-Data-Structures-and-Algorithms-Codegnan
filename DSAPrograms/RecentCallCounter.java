
package DSAPrograms;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCallCounter {

    Queue<Integer> queue;

    public RecentCallCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.add(t);

        while (!queue.isEmpty() && queue.peek() < (t - 3000)) {
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {

        RecentCallCounter rcc = new RecentCallCounter();

        System.out.println(rcc.ping(1));
        System.out.println(rcc.ping(100));
        System.out.println(rcc.ping(3000));
        System.out.println(rcc.ping(7000));
    }
}
