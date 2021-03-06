import java.util.Iterator;

public class MyIterator implements Iterator<Integer>{

	//FIELDS
	
	private Node cursor;

	
	//CONSTRUCTORS
	
	public MyIterator(Node first){
		this.cursor = first;
	}
	
	
	//METHODS
	
	//OVERRIDE
	
	@Override
	public boolean hasNext() {	//O(1)
		return this.cursor != null;
	}

	@Override
	public Integer next() {	//O(1)
		Integer info = this.cursor.getInfo();	//O(1)
		this.cursor = this.cursor.getNext();	//O(1)
		return info;
	}
	
	
	//EXTRAS
	
	public Integer get(){	//O(1)
		return this.cursor.getInfo();	//O(1)
	}
	
	public void move(){	//O(1)
		this.cursor = this.cursor.getNext();	//O(1)
	}
}
