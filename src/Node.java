public class Node {

	//FIELDS
	
	private Integer info;
	private Node next;

	
	//CONSTRUCTORS
	
	public Node() {	
		this.info = null;
		this.next = null;
	}
	
	public Node(Integer o, Node n) {	
		this.setInfo(o);	
		this.setNext(n);	
	}
	
	
	//METHODS
	
	//GETTERS & SETTERS
	
	public Node getNext() {		//O(1)
		return next;
	}

	public void setNext(Node next) {	//O(1)
		this.next = next;
	}

	public int getInfo() {	//O(1)
		return info;
	}

	public void setInfo(Integer info) {	//O(1)
		this.info = info;
	}

}
