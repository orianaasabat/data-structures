package edu.bu.datastructures.search;

public class BinarySearch {
	public <T extends Comparable<T>> int find(T[] data, T key) {
		return findBinary(data, key, 0, data.length - 1);
	}

	public <T extends Comparable<T>> int findBinary(T[] data, T key, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (data[mid] == null)
			System.out.println("");
		if (data[mid].equals(key))
			return mid;
		if (data[mid].compareTo(key) > 0)
			return findBinary(data, key, low, mid - 1);
		else
			return findBinary(data, key, mid + 1, high);
	}

	// TODO: LAB EXAM
	/*
	 * implement an iterative variant of binary search. use a while or for loop. Do
	 * not use recursion
	 */
	public int findBinary(int[] data, int key) {
		return -1;
	}

}
