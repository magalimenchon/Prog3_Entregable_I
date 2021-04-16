public class MySimpleLinkedList implements Iterable<Integer>{

	//FIELDS
		
	private Node first;
	private Node last;
	private int size;

	
	//CONSTRUCTORS
	
	public MySimpleLinkedList() {
		this.first = null;	//O(1)
		this.size = 0;	//O(1)
		this.last = this.first;	//O(1)
	}
	
	
	//METHODS
	
	//SKELETON
	
	/*insert the new information in the first position
	 * keeping the linked list */
	private void insertFront(Integer info) {	//O(1)
		
		Node tmp = new Node(info, null);	//O(1)
		tmp.setNext(this.first);	//O(1)
		this.first = tmp;	//O(1)
		this.size++;	//O(1)
	}
	
	/*return the data object of the first node
	 *and delete this node of the list */
	private Integer extractFront() {	//O(1)	//----No se utiliza en la entrega
		
		if(this.isEmpty())	//O(1)
			return null;
		else{
			Integer info = this.first.getInfo();	//O(1)	//get info of the first node
			this.first = this.first.getNext();		//O(1)	//unlink the node to the list
			this.size--;	//O(1)
			
			return info;	//return info of removed node
		}	
	}
	
	//return if the list have nodes or not
	public boolean isEmpty() {	//O(1)
		return this.first == null;	//O(1)
	}
	
	//return the info of the node in the number index.
	public Integer get(int index) {	//O(n): n is list.size/index
			
		if(this.isEmpty() || index < 0 || index > this.size)	//O(1)
				return null;
		else{
			MyIterator iter = this.iterator();	//O(1)
			for(int i=1; i < index; i++)	//O(n): n is list.size/index
				iter.move();	//O(1)
			return iter.get();	//O(1)
		}
			
	}
	//return the total of nodes of the list
	public int size() {		//O(1)
		return this.size;	//O(1)
	}
	
	//print info of some element in n position
	public void print(int n) {
		//imprime n cant de elementos?
	}
	
	//EXTRA
	
	/*insert the new information in the last position
	 * keeping the linked list */
	public void insertLast(Integer info) {	//O(1)
		if(this.isEmpty()){	//O(1)
			this.insertFront(info);	//O(1)
			this.last = this.first;	//O(1)
		}
		else{
			Node tmp = new Node(info, null);	//O(1)
			this.last.setNext(tmp);	//O(1)
			this.size++;	//O(1)
			this.last = tmp;	//O(1)
		}
	}

	//OVERRIDE
	
	@Override
	public MyIterator iterator() {	//O(1)
		//reference from which node starts browsing
		return new MyIterator(this.first);	//O(1)
	}
}
