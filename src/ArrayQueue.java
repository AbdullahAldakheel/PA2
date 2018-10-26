public class ArrayQueue<T> implements Queue<T> {
	
	
	
	

	private int maxsize;
	private int size;
	private int head, tail;
	private T[] nodes;


	
	
	public ArrayQueue(int n) {
		maxsize = n;
		size = 0;
		head = tail = 0;
		nodes = (T[])new Object[n];
	}
	
	public boolean full () {
		return size == maxsize;
	}
	
	public int length () {
		return size;
	}

	
	public void enqueue(T e) {
		nodes[tail] = e;
		tail = (tail + 1) % maxsize;
		size++;
	}
	
	public T serve () {
		T e = nodes[head];
		head = (head + 1) % maxsize;
		size--;
		return e;
	}

	
	public int multiEnqueue(T els[], int k){
		int m=els.length;
		int l =0;
		for (int i=0 ; i<k ; i++) {

			
			if(!full() && l<k && l<m) {
				enqueue(els[i]);
				l++;
			}

			
		}
		
		
		return l;
		
		
		
		
	}
	


	public int multiServe(T[] cls, int k) {
		int l=0;
		for (int i=0 ; i<k ; i++ ) {
			if(size==0 || k<l || cls.length<k) {
				break;
			}
			
			if(length()>0 && l>k) {
				cls[i] = (T)serve();
				l++;
			}
		
		}
	
		
		return l;
	}
	
	public void print() {
		int tmp = head;
		for (int i=0; i< size; i++) {
			System.out.print(nodes[tmp]);
			tmp++;
		}
		System.out.println("");

	}
	
}


