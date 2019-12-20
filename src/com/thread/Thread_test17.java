package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test17 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// 1.创建第一个线程，执行1~5相加
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			int sum = 0, i = 0;
			while (i++ < 10) {
				sum += i;

				System.out.println(Thread.currentThread().getName() + "线程任务正在执行..." + i);
			}
			return sum;
		});
		// 创建第二个线程，执行6~10相加
		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			int sum = 0, j = 10;
			while (j++ < 20) {
				sum += j;

				System.out.println(Thread.currentThread().getName() + "线程任务正在执行..." + j);
			}
			return sum;
		});

		//将两个线程执行结果进行获取整合
		int total = cf1.get() + cf2.get();
		System.out.println("1~20相加的结果为:" + total);

	}

}
