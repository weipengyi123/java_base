package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable {
	private int tickets = 10;
	private final Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			lock.lock();
			if (tickets > 0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + "正在发售" + tickets-- + "张票");
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} finally {
					lock.unlock();
				}

			}
		}
	}
}

public class Thread_test13 {

	public static void main(String[] args) {
		// 分别创建4个线程对象SaledThread并开启，来模拟4个售票窗口
		LockThread l1 = new LockThread();

		new Thread(l1, "窗口1").start();
		new Thread(l1, "窗口2").start();
		new Thread(l1, "窗口3").start();
		new Thread(l1, "窗口4").start();

	}

}
