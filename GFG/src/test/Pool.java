package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Pool {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(4);
		ThreadPoolExecutor exe = new ThreadPoolExecutor(1, 10, 1, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

		for (int i = 0; i < exe.getMaximumPoolSize(); i++)
			exe.execute(() -> System.out.println(Thread.currentThread().getName()));
	}
}
