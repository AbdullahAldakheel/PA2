import java.io.*;

public class SimpleEncrypt {
	
	public  static  Stack<Queue<Character>> readSentences(String fileName)throws Exception{
		
	

		LinkedStack lS = new LinkedStack();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			ArrayQueue a = new ArrayQueue (5000);

		    String line;
		    while ((line = br.readLine()) != null) {
		    	
				 char[] f = line.toCharArray();
		    	for(int i=0 ; i<f.length ; i++) {
		    		a.enqueue(f[i]);
		    	}
		    	System.out.println("line");
		    	lS.push(a);	
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

	
		int lim = q.length();
		for(int i=0 ; i<lim/k ; i++) {
			for(int j=0 ; j<k ; i++) {
				w.push(q.serve());
			}
			for(int j=0 ; j<k ; i++) {
				q.enqueue(w.pop());
			}
	
		}
	
		
	

	}
	

}
