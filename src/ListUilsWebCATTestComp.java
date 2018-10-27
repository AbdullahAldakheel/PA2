/*
 **********************************************************************************
 **********************************************************************************
 * DO NOT MODIFY THIS FILE.
 **********************************************************************************
 ********************************************************************************** 
 */

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

public class ListUilsWebCATTestComp {
	@Rule
	public Timeout globalTimeout = new Timeout(3000);

	List<Integer> al;
	List<Integer> ll1;
	List<Integer> ll2;

	// ArrayList
	@Test
	public void testArrayList() {
		try {
			al = new ArrayList<Integer>(3);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your code threw an exception");
			e.printStackTrace();
		}
	}

	// LinkedList methods
	@Test
	public void testLinkedList() {
		try {
			ll1 = new LinkedList<Integer>();
			assertTrue(true);
		} catch (Exception e) {
			fail("Your code threw an exception");
			e.printStackTrace();
		}
	}

	// insertBefore
	@Test
	public void testInsertBefore() {
		try {
			ll1 = new LinkedList<Integer>();
			ll1.insertBefore(140);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
	}

	// insertInOrder
	@Test
	public void testInsertInOrder() {
		try {
			ll1 = new LinkedList<Integer>();
			ListUtils.insertInOrder(ll1, 10);
			
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
	}

	// readValues
	@Test
	public void testReadValues() {
		try {
			ListUtils.readValues("test0.txt");
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
	}

	// merge
	@Test
	public void testMerge() {
		try {
			ll1 = new LinkedList<Integer>();
			ll2 = new LinkedList<Integer>();
			ListUtils.merge(ll1, ll2);
			assertTrue(true);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
	}
}
