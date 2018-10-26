
public class TestMain<T> {

	public static void main(String[] args) throws Exception {
		
		ArrayQueue<Character> a = new ArrayQueue<Character> (4);
		
		a.enqueue('A');
		a.enqueue('B');
		a.enqueue('C');
		a.enqueue('D');
		a.print();
		SimpleEncrypt v = new SimpleEncrypt();
	 
/*
		
		ArrayQueue<Integer> a = new ArrayQueue<Integer> (7);
		Integer[] b =  new Integer[5];

		
		b[0] = 1;
		b[1] = 2;

		

		

	

		
		int k = a.multiEnqueue(b,5);

		
		a.print();

		
		System.out.println("///////////");
		System.out.println("==" + k);
		
		a.enqueue(10);
		a.enqueue(15);
		a.enqueue(20);
		a.enqueue(25);
		a.enqueue(30);
		Integer[] c =  new Integer[5];
		a.multiServe(c, 5);
		
		for(int i=0 ; i<c.length ; i++) {
			System.out.println(c[i]);
		}
		
	

		
		
		LinkedStack<Integer> a = new LinkedStack<Integer>();
		Integer[] b =  new Integer[3];

		
		b[0] = 1;
		b[1] = 2;
		b[2] = 2;

		

		
		a.push(10);
		a.push(15);
		a.push(20);
		a.push(25);
		a.push(30);
		a.push(50);
		a.push(70);

		
		//int k = a.multiPush(b, 1);
		Integer[] c =  new Integer[7];
		a.multiPop(c, 10);

		

		 char[] f= "hello".toCharArray();
		System.out.println("///////////");
		

		

		a.print();

		

		
		*/
		
		
		
		/*
		
		
		
		SimpleEncrypt A = new SimpleEncrypt();
		LinkedStack a =(LinkedStack) A.readSentences("test01.txt");
		
		//ArrayQueue b = (ArrayQueue) a.pop();

		a.print();

		*/
	}
}
