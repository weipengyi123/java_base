package com.thread;

class SaledThread implements Runnable {
	private int tickets = 10;
	Object lock = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (lock) {

				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在发售" + tickets-- + "张票");
				}
			}

		}
	}
}
public class Thread_test11 {

	public static void main(String[] args) {
		// 分别创建4个线程对象SaledThread并开启，来模拟4个售票窗口
		SaledThread saledThread = new SaledThread();

		new Thread(saledThread, "窗口1").start();
		new Thread(saledThread, "窗口2").start();
		new Thread(saledThread, "窗口3").start();
		new Thread(saledThread, "窗口4").start();

	}

}
