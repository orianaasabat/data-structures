package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;

public class ArrayBasedListTest {
	@Test
	public void testSizeOfEmptyList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testAddingToList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(0, 5);
		assertEquals(5, (int) list.get(0));
		assertEquals(2, list.size());
	}

	@Test
	public void testAddingToListAtPosition2h() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(0, 5);
		assertEquals(5, (int) list.get(0));
		assertEquals(2, list.size());
	}
	@Test
	public void testRemovingFromList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(4);
		Integer removed = list.remove(1);
		assertEquals(4, (int) removed);
		assertEquals(1, list.size());
	}
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
