public class Node {

	//FIELDS
	
	private Integer info;
	private Node next;

	
	//CONSTRUCTORS
	
	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(int o, Node n) {
		this.setInfo(o);
		this.setNext(n);
	}
	
	
	//METHODS
	
	//GETTERS & SETTERS
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

}
