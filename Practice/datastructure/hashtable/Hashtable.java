package hashtable;

public class Hashtable {
	private Node[] data;
	private int capacity;
	private int currentSize;

	public Hashtable(int capacity) {
		this.capacity = capacity; 
		this.currentSize = 0;
		data = new Node[capacity];
		for(int i = 0; i < data.length; i++) {
			data[i] = new Node();
		}
	}

	public void makeEmpty() {
		currentSize = 0;
		data = new Node[capacity];
		for(int i = 0; i < data.length; i++) {
			data[i] = new Node();
		}
	}

	public int getSize() {
		return currentSize;
	}

	public boolean isFull() {
		return currentSize == capacity;
	}

	public boolean contains(String key) {
        return get(key) !=  null;
    }
	
	public int hashThis(String key) {
		return key.hashCode() % capacity; 
	}

	private int findHash(String key) {
		int hash = hashThis(key);

		while(data[hash] != null && data[hash].key != key) {

			hash = (hash + 1) % capacity;
		}
		return hash;
	}

	public Object get(String key) {
		return data[findHash(key)].value;
	}

	public void put(String key, Object value) {

		data[findHash(key)] = new Node(key, value); 
		currentSize++;
	}


	public void remove(String key) {
		if (!contains(key)) 
			return;

		int i = findHash(key);
		while (!key.equals(data[i].key)) 
			i = (i + 1) % capacity;        
		data[i].key = null;
		data[i].value = null;

		/** rehash all keys **/        
		for (i = (i + 1) % capacity; data[i].key != null; i = (i + 1) % capacity) {
			String tempKey = data[i].key;
			Object tempValue = data[i].value;
			data[i].key = null;
			data[i].value = null;
			currentSize--;  
			put(tempKey, tempValue);            
		}
		currentSize--;        
	}       



	public String toString(){
		String s = "<";

		for (int i = 0; i < this.capacity; i++) {
			s += data[i] + ", ";    
		}

		s += ">";
		return s;
	}
}




/*package hashtable;

public class Hashtable {
	private Node[] data;
	private int capacity;
	private int currentSize;
	private static final Node AVAILABLE = new Node("Available", null);

	public Hashtable(int capacity) {
		this.capacity = capacity; 
		this.currentSize = 0;
		data = new Node[capacity];
		for(int i = 0; i < data.length; i++) {
			data[i] = AVAILABLE;
		}
	}

	public void makeEmpty() {
		currentSize = 0;
		data = new Node[capacity];
		for(int i = 0; i < data.length; i++) {
			data[i] = AVAILABLE;
		}
	}

	public int getSize() {
		return currentSize;
	}

	public boolean isFull() {
		return currentSize == capacity;
	}

	public int hashThis(String key) {
		return key.hashCode() % capacity; 
	}

	private int findHash(String key) {
		int hash = hashThis(key);

		while(data[hash] != AVAILABLE && data[hash].key() != key) {

			hash = (hash + 1) % capacity;
		}
		return hash;
	}

	public Object get(String key) {
		return data[findHash(key)].element();
	}

	public void put(String key, Object element) {

		data[findHash(key)] = new Node(key, element); 
	}

	public String toString(){
		String s = "<";

		for (int i = 0; i < this.capacity; i++) {
			s += data[i] + ", ";    
		}

		s += ">";
		return s;
	}
}
 */