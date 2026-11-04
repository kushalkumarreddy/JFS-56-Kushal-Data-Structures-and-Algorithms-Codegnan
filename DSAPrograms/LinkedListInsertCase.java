package DSAPrograms;


public class LinkedListInsertCase {
    int val;
    DoubleListNode prev;
    DoubleListNode next;

    public LinkedListInsertCase(int val) {
        this.val = val;
        prev = null;
        next = null;
    }

    // Insert at beginning
    public static DoubleListNode insertBeginning(
            DoubleListNode head, int val) {

        DoubleListNode newNode = new DoubleListNode(val);

        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
        return head;
    }

    // Insert at end
    public static DoubleListNode insertEnd(
            DoubleListNode head, int val) {

        DoubleListNode newNode = new DoubleListNode(val);

        if (head == null) {
            return newNode;
        }

        DoubleListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Insert at a specific position (1-based)
    public static DoubleListNode insertPosition(
            DoubleListNode head, int val, int position) {

        if (position < 1) {
            System.out.println("Invalid position");
            return head;
        }

        if (position == 1) {
            return insertBeginning(head, val);
        }

        DoubleListNode temp = head;
        int i = 1;

        while (temp != null && i < position - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        DoubleListNode newNode = new DoubleListNode(val);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
    }

    // Display list
    public static void display(DoubleListNode head) {
        DoubleListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleListNode head = new DoubleListNode(10);

        head = insertEnd(head, 20);
        head = insertEnd(head, 30);

        System.out.println("Original List:");
        display(head);

        head = insertBeginning(head, 5);
        System.out.println("After inserting at beginning:");
        display(head);

        head = insertEnd(head, 40);
        System.out.println("After inserting at end:");
        display(head);

        head = insertPosition(head, 25, 4);
        System.out.println("After inserting at position 4:");
        display(head);
    }
}
