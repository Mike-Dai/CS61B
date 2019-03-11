public class DoublyLinkedList {
	
	public LinkNode head;
	public LinkNode tail;
	private int size;

	public DoublyLinkedList() {
		head = null;
		tail = null;
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
		if (size == 0) {
			head = new LinkNode(runLengths, red, green, blue);
			tail = head;
			size++;
		}
		else {
			LinkNode run = new LinkNode(runLengths, red, green, blue);
			run.prev = tail;
			tail.next = run;
			tail = run;
			size++;
		}
	}
}