package edu.bu.datastructures.diverse;

public class TestAndSetLock {

	static boolean isBusy;

	public static void main(String[] a) {
		lock();
		// enter critical region
		unlock();
	}

	private static void unlock() {
		isBusy = false;
	}

	public static void lock() {
		while (testAndSet());
	}

	public static synchronized boolean testAndSet() {
		boolean lastStatusOfCriticalRegion = isBusy;
		isBusy = true;
		return lastStatusOfCriticalRegion;
	}

}
