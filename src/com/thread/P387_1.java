package com.thread;

class TicketWindow3 implements Runnable {
	private int tickets = 80;

	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在发第" + tickets-- + "份学习笔记");
			}
		}
	}
}
public class P387_1 {
	public static void main(String[] args) {
		// 分别创建4个线程对象TicketWindow并开启，来模拟4个售票窗口
		TicketWindow3 tw = new TicketWindow3();
		new Thread(tw,"a老师").start();
		new Thread(tw,"b老师").start();
		new Thread(tw,"c老师").start();
	}

}
