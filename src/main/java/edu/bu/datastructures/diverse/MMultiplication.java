package edu.bu.datastructures.diverse;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MMultiplication {

	public static void main(String[] args) throws InterruptedException {
		int common = 1000;
		int aRows = 1000;
		int bColumns = 1000;
		int[][] a = new int[aRows][common];
		int[][] b = new int[common][bColumns];
		int[][] resultArray = new int[aRows][bColumns];
		double timeBefore = System.currentTimeMillis();
		for (int aRow = 0; aRow < aRows; aRow++)
			for (int bColumn = 0; bColumn < bColumns; bColumn++) {
				for (int k = 0; k < common; k++) {
					resultArray[aRow][bColumn] += a[aRow][k] * b[k][bColumn];
				}
			}
		System.out.println("exe time  = " + (System.currentTimeMillis() - timeBefore));
	}

}
