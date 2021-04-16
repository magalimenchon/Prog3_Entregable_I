public class Node {

	//FIELDS
	
	private Integer info;
	private Node next;

	
	//CONSTRUCTORS
	
	public Node() {	//O(1)
		this.info = null;	//O(1)
		this.next = null;	//O(1)
	}
	
	public Node(Integer o, Node n) {	//O(1)
		this.setInfo(o);	//O(1)
		this.setNext(n);	//O(1)
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
