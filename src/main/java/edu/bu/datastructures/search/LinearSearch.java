package edu.bu.datastructures.search;

public class LinearSearch {
	public <T extends Comparable<T>> int find(T[] data, T key) {
		for(int i=0;i<data.length;i++) {
			if(data[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
}
