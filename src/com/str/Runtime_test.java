package com.str;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args) throws IOException,InterruptedException{
		
		Runtime rt=Runtime.getRuntime();
		
		
		System.out.println("处理器的个数:"+rt.availableProcessors()+"个");
		System.out.println("空间内存大小"+rt.freeMemory()+"M");
		System.out.println("最大可用内存大小"+rt.maxMemory()+"M");
		
		//调用系统命令
		Process jicheng=rt.exec("notepad.exe");
		//系统休眠3秒
		Thread.sleep(3000);
		//关闭进程
		jicheng.destroy();
		
		
	}

}
