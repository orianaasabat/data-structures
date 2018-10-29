package edu.bu.datastructures.diverse;

import static org.junit.Assume.assumeNoException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksExample {
	static int a = 0;

	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		ExecutorService executorService = Executors.newCachedThreadPool();
		Runnable task = new Runnable() {
			@Override
			public void run() {
				lock.lock();
				a++;
				//lock.unlock();
			}
		};
		for (int i = 0; i < 500; i++) {
			executorService.execute(task);
		}
		executorService.shutdown();
		executorService.awaitTermination(3,TimeUnit.SECONDS);

		System.out.println(a);
	}

}
