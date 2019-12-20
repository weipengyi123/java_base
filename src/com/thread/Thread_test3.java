package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread3 implements Callable<Object> {

	@Override
	public Integer call() throws Exception {
		int i = 0;
		while (i++ < 15) {
			System.out.println(Thread.currentThread().getName() + "的run()方法在运行");
		}
		return i;
	}
}

public class Thread_test3 {
	public static void main(String[] args) throws Exception, ExecutionException {
		// 创建MyThread实例对象
		MyThread3 mt1 = new MyThread3();
		FutureTask<Object> ft1 = new FutureTask<Object>(mt1);
		Thread t1 = new Thread(ft1, "线程1");
		// 调用start()方法启动线程
		t1.start();
		MyThread3 mt2 = new MyThread3();
		FutureTask<Object> ft2 = new FutureTask<Object>(mt2);
		Thread t2 = new Thread(ft2, "线程2");
		// 调用start()方法启动线程
		t2.start();
		//通过FutureTask对象的方法管理返回值
		new Thread(new FutureTask<Object>(new MyThread3()), "线程3").start();
		System.out.println("线程1返回结果" + ft1.get());
		System.out.println("线程2返回结果" + ft2.get());
	}

}
