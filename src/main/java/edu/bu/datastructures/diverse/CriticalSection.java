package edu.bu.datastructures.diverse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CriticalSection {
	static int a = 0;
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 500; i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					lock.lock();
					a++;
					lock.unlock();
				}

			});

		}
		executorService.shutdown();
		System.out.println(a);
	}

}
