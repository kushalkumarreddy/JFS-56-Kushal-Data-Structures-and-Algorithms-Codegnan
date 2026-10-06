package DSAPrograms;

public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        this.val = x;
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

        ListNode ptr = l1;

        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }
}