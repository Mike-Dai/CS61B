public class DoublyLinkedList {
	
	public LinkNode head;
	private int size;

	public DoublyLinkedList() {
		head = new LinkNode();
		head.prev = head;
		head.next = head;
		size = 0;
	}
/*
	public LinkNode tail() {
		LinkNode p = head;
		while (p.next != null) {
			p = p.next;
		}
		return p;
	}
*/
	public void insert(int runLengths, int red, int green, int blue) {
		LinkNode run = new LinkNode(runLengths, red, green, blue);
		head.prev.next = run;
		run.prev = head.prev;
		head.prev = run;
		run.next = head;
		size++;
	}
}