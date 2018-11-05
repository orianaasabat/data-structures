package edu.bu.datastructures.diverse;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MMultiplicationMultithreaded {

	public static void main(String[] args) throws InterruptedException {
		int common = 1000;
		int aRows = 1000;
		int bColumns = 1000;
		int[][] a = new int[aRows][common];
		int[][] b = new int[common][bColumns];
		int[][] c = new int[aRows][bColumns];
		ExecutorService es = Executors.newCachedThreadPool();
		double timeBefore = System.currentTimeMillis();
		for (int aRow = 0; aRow < aRows; aRow++)
			for (int bColumn = 0; bColumn < bColumns; bColumn++) {
				es.submit(new MultiplicationTask(c, a, b, aRow, bColumn, common));
			}
		es.shutdown();
		es.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println("exe time  = " + (System.currentTimeMillis() - timeBefore));
		//System.out.println(Arrays.toString(c[0]));
		//System.out.println(Arrays.toString(c[1]));
	}

}
