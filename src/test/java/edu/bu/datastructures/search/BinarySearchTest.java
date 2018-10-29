package edu.bu.datastructures.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class BinarySearchTest {
	@Test
	public void testinarySearch() {
		List<Integer> list = new ArrayList<>();
		int arraySize = 100000000;
		for (long i = 0; i < arraySize; i++) {
			list.add(new Random().nextInt(arraySize));
		}
		Collections.sort(list);
		Integer[] a = new Integer[arraySize];
		list.toArray(a);
		BinarySearch binarySearch = new BinarySearch();
		LinearSearch linearSearch = new LinearSearch();
		long startTime = System.nanoTime();
		int find = binarySearch.find(a, -1);
		
		long endTime = System.nanoTime();
		long binaryTime = endTime - startTime;
		startTime = System.currentTimeMillis();
		int findL = linearSearch.find(a, -1);
		endTime = System.currentTimeMillis();
		long LTime = endTime - startTime;

		System.out.println(find + " took " + binaryTime + " L time " + LTime);
	}
}
