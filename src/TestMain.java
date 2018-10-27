
public class TestMain<T> {

	public static void main(String[] args) throws Exception {	
		/*
		ArrayQueue<Integer> Q = new ArrayQueue<Integer> (7);
		Integer[] Q1 =  new Integer[5];
		Q.enqueue(10);
		Q.enqueue(15);
		Q.enqueue(20);
		Q.enqueue(25);
		Q.enqueue(30);
		
		Q1[0] = 1;
		Q1[1] = 2;

		

		

	

		
		int k = Q.multiEnqueue(Q1,5);

		
		Q.print();

		
		System.out.println("///////////");
		System.out.println("==" + k);
		
		Q.enqueue(10);
		Q.enqueue(15);
		Q.enqueue(20);
		Q.enqueue(25);
		Q.enqueue(30);
		Integer[] c =  new Integer[5];
		Q.multiServe(c, 5);
		
		for(int i=0 ; i<c.length ; i++) {
			System.out.println(c[i]);
		}
		
	

		
		
		LinkedStack<Integer> S = new LinkedStack<Integer>();
		Integer[] S1 =  new Integer[3];

		
		S1[0] = 1;
		S1[1] = 2;
		S1[2] = 2;

		

		S.push(30);
		S.push(50);
		S.push(70);

		
		int k = S.multiPush(S1, 3);
		Integer[] S2 =  new Integer[7];
		S.multiPop(S2, 8);

	
		

		

		S.print();

		

		*/
		
		
		
		
		
		
		
		
		SimpleEncrypt A = new SimpleEncrypt();
		LinkedStack j =(LinkedStack) A.readSentences("test01.txt");
		while(!j.empty()) {
			ArrayQueue b = (ArrayQueue) j.pop();
			b.print();
		}
		 System.out.println();
		System.out.println("==== Encrypt And De ====");
		 System.out.println();
		ArrayQueue<Character> a = new ArrayQueue<Character> (80);
		
		a.enqueue('A');
		a.enqueue('B');
		a.enqueue('C');
		a.enqueue('D');
		a.enqueue('E');
		a.enqueue('F');
		a.enqueue('G');
		a.enqueue('H');
		a.enqueue('I');
		a.enqueue('J');
		a.enqueue('K');
		a.enqueue('L');
		a.enqueue('M');
		a.enqueue('N');
		a.print();
	
		SimpleEncrypt v = new SimpleEncrypt();
	 v.encrypt(a, 10);
	 a.print();

	 v.decrypt(a, 10);
	

	 a.print();
	 System.out.println();
	System.out.println("==== Encrypt And De (Stack) ====");
	 System.out.println();
	 
		ArrayQueue<Character> b = new ArrayQueue<Character> (80);
		
		b.enqueue('1');
		b.enqueue('2');
		b.enqueue('3');
		b.enqueue('4');
		b.enqueue('5');
		b.enqueue('6');
		b.enqueue('7');
		b.enqueue('8');
		b.enqueue('9');
	 LinkedStack n = new LinkedStack();
	 n.push(a);
	 n.push(b);

		while(!n.empty()) {
			ArrayQueue o = (ArrayQueue) n.pop();
			o.print();
		}
		System.out.println("=");
	 n.push(a);
	 n.push(b);


	 v.encrypt(n,2);

		while(!n.empty()) {
			ArrayQueue o = (ArrayQueue) n.pop();
			o.print();
		}
		 n.push(a);
		 n.push(b);
		v.encrypt(n,2);
	
		System.out.println("=");
		while(!n.empty()) {
			ArrayQueue o = (ArrayQueue) n.pop();
			o.print();
		}
		
	}
}
