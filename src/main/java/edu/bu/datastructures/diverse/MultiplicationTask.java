package edu.bu.datastructures.diverse;

public class MultiplicationTask implements Runnable {
	int[][] resultArray;
	int[][] a;
	int[][] b;
	int aRow;
	int bColumn;
	int common;

	public MultiplicationTask(int[][] resultArray, int[][] a, int[][] b, int aRow, int bColumn, int common) {
		this.resultArray = resultArray;
		this.a = a;
		this.b = b;
		this.aRow = aRow;
		this.bColumn = bColumn;
		this.common = common;
	}

	@Override
	public void run() {
		for (int k = 0; k < common; k++) {
			resultArray[aRow][bColumn] += a[aRow][k] * b[k][bColumn];
		}

	}

}
