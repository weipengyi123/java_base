package com.thread;

class TicketWindow1 extends Thread {
	private int tickets = 100;

	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在发售" + tickets-- + "张票");
			}
		}
	}
}

public class Thread_test4 {

	public static void main(String[] args) {
		// 分别创建4个线程对象TicketWindow并开启，来模拟4个售票窗口
		TicketWindow1 t1 = new TicketWindow1();
		t1.start();
		TicketWindow1 t2 = new TicketWindow1();
		t2.start();
		TicketWindow1 t3 = new TicketWindow1();
		t3.start();
		TicketWindow1 t4 = new TicketWindow1();
		t4.start();

	}

}
