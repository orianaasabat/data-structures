package edu.bu.datastructures.list;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40,100 };
		System.out.println(sum(a, 0));
	}

	static int sum(int[] a, int i) {
		if (i == a.length - 1)
			return a[i];
		return a[i] + sum(a, i + 1);
	}

}
