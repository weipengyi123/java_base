package com.io;

import java.io.RandomAccessFile;

public class RandomAccessFile_test {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("times.txt", "rw");
		int times = Integer.parseInt(raf.readLine()) - 1;
		// 判断剩余次数
		if (times > 0) {
			System.out.println("你还可以试用" + times + "次！");
			// 将记录指针重新指向文件开头                                                                                    
			raf.seek(0);
			// 将剩余次数写入文件
			raf.write((times + "").getBytes());

		} else {
			System.out.println("试用次数已经用完辽！！");
		}
		// 关闭流
		raf.close();
	}

}
