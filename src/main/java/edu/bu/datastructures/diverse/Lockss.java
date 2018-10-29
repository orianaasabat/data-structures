package edu.bu.datastructures.diverse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockss {
	static int a = 0;
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5000; i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					lock.lock();
					try {
						a++;
					} finally {

						lock.unlock();
					}
				}
			});
		}
		executorService.shutdown();
		boolean finshed = executorService.awaitTermination(1, TimeUnit.MINUTES);
		System.out.println(finshed);
		System.out.println(a);
	}
	
	

}
