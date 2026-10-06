package DSAPrograms;

public class InsertionCase {

    public ListNode insertAtBeginning(ListNode head, int value) {

        ListNode newNode = new ListNode(value);

        newNode.next = head;

        head = newNode;

        return head;
    }

    public void traverse(ListNode head) {

        ListNode ptr = head;

        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(56);
        ListNode l2 = new ListNode(30);
        ListNode l3 = new ListNode(70);
        ListNode l4 = new ListNode(20);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        InsertionCase obj = new InsertionCase();

        l1 = obj.insertAtBeginning(l1, 10);

        obj.traverse(l1);
    }
}