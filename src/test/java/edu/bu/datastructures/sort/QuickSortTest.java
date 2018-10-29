package edu.bu.datastructures.sort;

import java.util.Arrays;

import org.junit.Test;

import edu.bu.datastructures.sorting.QuickSort;

public class QuickSortTest {
	@Test
	public void testSort() {
		int[] a = { 55,1, 22, 3, 44, 5 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(a);
		System.out.println(Arrays.toString(a));
		
	}
}
