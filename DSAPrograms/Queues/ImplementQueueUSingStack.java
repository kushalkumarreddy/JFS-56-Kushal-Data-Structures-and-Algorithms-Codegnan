package DSAPrograms.Queues;


import java.util.Stack;

class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Insert element into Queue
    public void push(int x) {
        s1.push(x);
    }

    // Remove front element
    public int pop() {

        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    // View front element
    public int peek() {

        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class ImplementQueueUSingStack {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.peek());  // 10
        System.out.println(q.pop());   // 10
        System.out.println(q.pop());   // 20
        System.out.println(q.peek());  // 30
        System.out.println(q.empty()); // false
    }
}
