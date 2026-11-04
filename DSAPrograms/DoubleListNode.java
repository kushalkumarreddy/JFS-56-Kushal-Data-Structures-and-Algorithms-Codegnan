package DSAPrograms;

public class DoubleListNode {
	int val;
	DoubleListNode prev;
	DoubleListNode next;
	
	public DoubleListNode(int val) {
		this.val = val;
		prev = null;
		next = null;
	}
	
	public static void main(String[] args) {
		DoubleListNode l1 = new DoubleListNode(3);
		DoubleListNode l2 = new DoubleListNode(7);
		DoubleListNode l3 = new DoubleListNode(5);
		DoubleListNode l4 = new DoubleListNode(2);
		
		l1.next=l2;
		l2.prev=l1;
		
		l2.next=l3;
		l3.prev=l2;
		
		l3.next=l4;
		l4.prev=l3;
		
		DoubleListNode temp=l1;
		while(temp!=null) {
			System.out.print(temp.val+" -> ");
			temp = temp.next;
		}
		
		System.out.println();
		
		DoubleListNode ptr = l4;
		while(ptr!=null) {
			System.out.print(ptr.val+" -> ");
			ptr=ptr.prev;
		}
		
	}

}