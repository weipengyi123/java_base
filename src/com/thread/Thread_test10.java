package com.thread;
class EmergencyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "输入:" + i);
		}
		
	}
	
}
public class Thread_test10 {

	public static void main(String[] args) throws Exception {
		// 创建线程
		Thread thread1=new Thread(new EmergencyThread(),"thread1");
		thread1.start();
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "输入:" + i);
			if (i==2) {
				//调用join方法
				thread1.join();
			}
		}
		
	}

}
