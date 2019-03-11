public class LinkNode {
	public int[] color;
	public LinkNode prev;
	public LinkNode next;

	public LinkNode() {
		int[] newcolor = new int[4];
		this.color = newcolor;
		this.color[0] = 0;
		this.color[1] = 0;
		this.color[2] = 0;
		this.color[3] = 0;
		this.prev = null;
		this.next = null;
	}

	public LinkNode(int runLengths, int red, int green, int blue) {
		int[] color = new int[4];
		this.color = color;
		this.color[0] = runLengths;
		this.color[1] = red;
		this.color[2] = green;
		this.color[3] = blue;
		this.prev = null;
		this.next = null;		
	}
}