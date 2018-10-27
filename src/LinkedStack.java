public class LinkedStack<T> implements Stack<T> {
	
	

	private Node<T> top;

	public LinkedStack() {
		top = null;
	}
	
	
	
	public boolean empty(){
		return top == null;
	}
	
	public boolean full(){
		return false;
	}

	public void push(T e){
		Node<T> tmp = new Node<T>(e);
		tmp.next = top;
		top = tmp;
	}

	public T pop(){
		T e = top.data;
		top = top.next;
		return e;
	}



	@Override
	public int multiPush(T[] els, int k) {
		int l =0;
		for(int i=0 ; i<k ; i++) {
			if(full() || l>=els.length) {
				break;
			}
			push(els[i]);
			l++;
		}
		return l;
	}



	@Override
	public int multiPop(T[] els, int k) {

		int l=0;
		for(int i=0 ; i<k ; i++) {
			if(els.length<=l) {
				break;
			}
			if(!empty()) {
				els[i] = pop();
				l++;
			}
		
		}
		return l;
	}

	public void print() {
		Node<T> tmp = top;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}


}