package DSAPrograms;


class CircularQueue {

    int[] arr;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Insert element
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;

        System.out.println(value + " inserted");
    }

    // Remove element
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[front];
        front = (front + 1) % capacity;
        size--;

        return value;
    }

    // View front element
    int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();                    // 10 20 30 40

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(50);
        q.enqueue(60);

        q.display();                    // 30 40 50 60

        System.out.println(q.peek());    // 30
    }
}
