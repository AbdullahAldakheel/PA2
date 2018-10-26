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
		
		int l =0;
		int len = length();
		for (int i=0 ; i<k ; i++) {
			if(!full() && els.length >= k) {
				enqueue(els[i]);
				l++;
			}
			
		}
		
		
		return l;
		
		
		
		
	}
	


	public int multiServe(T[] cls, int k) {
		int l=0;
		int time = size;
		int nSave=0;
		for (int i=0 ; i<time ; i++ ) {
			if(size==0 || k<nSave || cls.length<k) {
				break;
			}
			T save = serve();
			cls[i] = save;
			nSave++;	
			l++;
		}
	
		
		return l;
	}
	
	
	
	
}


