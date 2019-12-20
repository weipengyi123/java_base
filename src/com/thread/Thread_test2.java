package com.thread;
class MyThread2 implements Runnable {
	public void run() {
		int i = 0;
		while (i++ < 15) {
			System.out.println(Thread.currentThread().getName() + "的run()方法在运行");
		}
	}
}
public class Thread_test2 {
	public static void main(String[] args) {
		//创建MyThread实例对象
		MyThread2 mt1=new MyThread2();
		Thread t1=new Thread(mt1,"线程1");
		//调用start()方法启动线程
		t1.start();
		MyThread2 mt2=new MyThread2();
		Thread t2=new Thread(mt2,"线程2");
		t2.start();
		new Thread(new MyThread2(),"线程3").start();
	}

}
