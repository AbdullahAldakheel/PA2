

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

public class SimpleEncryptWebCATTestComp {
	@Rule
	public Timeout globalTimeout = new Timeout(3000);

	Queue<Integer> al;
	Queue<Integer> ll1;
	Queue<Integer> ll2;
	Queue<Integer> ll3;
	
	Stack<Integer> a;
	Stack<Integer> l1;
	Stack<Integer> l2;

	// ArrayQueue
	@Test
	public void testArrayQueue() {
		
		try {
			al = new ArrayQueue<Integer>(3);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your code threw an exception");
			e.printStackTrace();
		}
		System.out.println("Test 01 Done");
	}

	// LinkedStack methods
	@Test
	public void testLinkedStack() {
		try {
			a = new LinkedStack<Integer>();
			assertTrue(true);
		} catch (Exception e) {
			fail("Your code threw an exception");
			e.printStackTrace();
		}
		System.out.println("Test 02 Done");
	}

	// multiPush
	@Test
	public void multiPush() {
		try {
			l1 = new LinkedStack<Integer>();
			Integer[] S1 =  new Integer[1];
			S1[0] = 1;
			l1.multiPush(S1, 1);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
		System.out.println("Test 03 Done");
	}
	// multiPop
	@Test
	public void multiPop() {
		try {
			l2 = new LinkedStack<Integer>();
			l2.push(2);
			Integer[] S1 =  new Integer[2];
			S1[0] = 1;
			l2.multiPop(S1, 1);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
		System.out.println("Test 04 Done");
	}
	// multiEnqueue
	@Test
	public void multiEnqueue() {
		try {
			ll1 = new ArrayQueue<Integer>(2);
			ll1.enqueue(2);
			Integer[] S1 =  new Integer[2];
			S1[0] = 1;
			ll1.multiEnqueue(S1, 1);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
		System.out.println("Test 05 Done");
	}
	// multiServe
	@Test
	public void multiServe() {
		try {
			ll2 = new ArrayQueue<Integer>(1);
			ll2.enqueue(2);
			Integer[] S1 =  new Integer[2];
			S1[0] = 1;
			ll2.multiServe(S1, 1);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
		System.out.println("Test 06 Done");
	}

	// readSentences
	@Test
	public void readSentences() {
		try {
			SimpleEncrypt.readSentences("test01.txt");
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
		System.out.println("Test 07 Done");
	}
	
	// encrypt1
	@Test
	public void encrypt() {
		try {
			Queue<Character> ll1 = new ArrayQueue<Character>(8);
			ll1.enqueue('1');
			ll1.enqueue('2');
			ll1.enqueue('3');
			ll1.enqueue('4');
			ll1.enqueue('5');
			ll1.enqueue('6');
			ll1.enqueue('7');
			ll1.enqueue('8');
			SimpleEncrypt.encrypt((Queue<Character>) ll1, 4);
			
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
		System.out.println("Test 08 Done");
	}
	// decrypt1
	@Test
	public void decrypt() {
		try {
			Queue<Character> ll1 = new ArrayQueue<Character>(8);
			ll1.enqueue('1');
			ll1.enqueue('2');
			ll1.enqueue('3');
			ll1.enqueue('4');
			ll1.enqueue('5');
			ll1.enqueue('6');
			ll1.enqueue('7');
			ll1.enqueue('8');
			SimpleEncrypt.decrypt((Queue<Character>) ll1, 4);
			
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
		System.out.println("Test 09 Done");
	}

}
