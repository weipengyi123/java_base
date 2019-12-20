package com.thread;

class TicketWindow2 implements Runnable {
	private int tickets = 100;

	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在发售" + tickets-- + "张票");
			}
		}
	}
}
public class Thread_test5 {

	public static void main(String[] args) {
		// 分别创建4个线程对象TicketWindow并开启，来模拟4个售票窗口
		TicketWindow2 tw = new TicketWindow2();

		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
		

	}

}
