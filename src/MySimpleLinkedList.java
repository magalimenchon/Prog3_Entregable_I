public class MySimpleLinkedList implements Iterable<Integer>{

	//FIELDS
		
	private Node first;
	private Node last;
	private int size;

	
	//CONSTRUCTORS
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;	//O(1)
		this.last = this.first;
	}
	
	
	//METHODS
	
	//SKELETON
	
	/*insert the new information in the first position
	 * keeping the linked list */
	private void insertFront(Integer info) {
		
		Node tmp = new Node(info, null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	
	/*return the data object of the first node
	 *and delete this node of the list */
	private Object extractFront() {	//--------puedo cambiarlo por Integer?
		
		if(this.isEmpty())
			return null;
		else{
			Integer info = this.first.getInfo();	//get info of the first node
			this.first = this.first.getNext();	//unlink the node to the list
			this.size--;
			
			return info;	//return info of removed node
		}	
	}
	
	//return if the list have nodes or not
	public boolean isEmpty() {
		return this.first == null;
	}
	
	//return the total of nodes of the list
	public int size() {
		return this.size;
	}
	
	//return the info of the node in the number index.
	public Object get(int index) {	//O(n):n is list.size/index
		//puedo cambiar por index?
		if(this.isEmpty() || index < 0 || index > this.size)
			return null;
		else{	///---------------------------PREGUNTAR------------------
			Node cursor = new Node(0,first);	//created cursor point to the first node
			for(int i=0; i < index; i++)
				cursor = cursor.getNext();
			return cursor.getInfo();
		}
		
	}
	
	//EXTRA
	
	/*insert the new information in the last position
	 * keeping the linked list */
	public void insertLast(Integer info) {	//O(1)
		if(this.isEmpty()){
			this.insertFront(info);
			this.last = this.first;
		}
		else{
			Node tmp = new Node(info, null);
			this.last.setNext(tmp);
			this.size++;
			this.last = tmp;
		}
	}

	//OVERRIDE
	
	@Override
	public MyIterator iterator() {
		//reference from which node starts browsing
		return new MyIterator(this.first);	//referencia desde cual nodo arranca a navegar
	}
}
