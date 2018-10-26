
public class TestMain<T> {

	public static void main(String[] args) {

		
		ArrayQueue<Integer> a = new ArrayQueue<Integer> (10);
		Integer[] b =  new Integer[5];

		
		b[0] = 1;
		b[1] = 2;

		

		

		
		a.enqueue(10);
		a.enqueue(15);
		a.enqueue(20);
		a.enqueue(25);
		a.enqueue(30);

		
		int k = a.multiEnqueue(b,10);

		
		a.print();

		
		System.out.println("///////////");
		System.out.println("==" + k);

		
	}

}
