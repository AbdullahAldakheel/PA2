import java.io.*;

public class SimpleEncrypt {
	
	public  static  Stack<Queue<Character>> readSentences(String fileName)throws Exception{
		
	

		LinkedStack lS = new LinkedStack();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
		    String line=null;
		    while ((line = br.readLine()) != null) {
		    	ArrayQueue a = new ArrayQueue (5000);
				 char[] f = line.toCharArray();
		    	for(int i=0 ; i<f.length ; i++) {
		    		a.enqueue(f[i]);
		    	}
		    	System.out.println("line");
		    	lS.push(a);	
		    	
		    	f = null;
		    }
    
		}
		
		LinkedStack lS2 = new LinkedStack();
		
		while(!lS.empty()) {
			lS2.push(lS.pop());
		}
		
		return lS2;
		
		
		
	}
	public  static  void encrypt(Queue<Character> q,int k) {
		LinkedStack<Character> w = new LinkedStack<Character>();

	if(k==0) {
		return;
	}
		int lim = q.length();
		for(int i=0 ; i<lim/k ; i++) {
			
			for(int j=0 ; j<k ; j++) {
				w.push(q.serve());
			}
			for(int j=0 ; j<k ; j++) {
				q.enqueue(w.pop());
			}
	
		}
	}

public  static  void decrypt(Queue<Character> q, int k) {
	
	encrypt(q,k);
}


public  static  void encrypt(Stack<Queue<Character>> st,int k) {
	ArrayQueue<Character> u;
	LinkedStack<Stack<Queue<Character>>> j = new LinkedStack<Stack<Queue<Character>>>();
		while(!st.empty()) {
	
			ArrayQueue<Character> w = (ArrayQueue<Character>) st.pop();
		encrypt(w,k);
		j.push((Stack<Queue<Character>>) w);
	}
	while(!j.empty()) {
		st.push((Queue<Character>) j.pop());
	}	
} 
	
public  static  void decrypt(Stack<Queue<Character>> st, int k) {
	ArrayQueue<Character> u;
	LinkedStack<Stack<Queue<Character>>> j = new LinkedStack<Stack<Queue<Character>>>();
		while(!st.empty()) {
	
			ArrayQueue<Character> w = (ArrayQueue<Character>) st.pop();
		encrypt(w,k);
		j.push((Stack<Queue<Character>>) w);
	}
	while(!j.empty()) {
		st.push((Queue<Character>) j.pop());
	}	
	
}



}
