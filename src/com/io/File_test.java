package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_test {

	public static void main(String[] args) throws IOException {
		File file = new File("example.txt");
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		bWriter.write("itcast");
		bWriter.flush();
		bWriter.close();

		System.out.println("文件名称是:" + file.getName());
		System.out.println("文件相对路径是:" + file.getPath());
		System.out.println("文件绝对是:" + file.getAbsolutePath());
		System.out.println("文件父路径是:" + file.getParent());
		if (file.canRead()) {
			System.out.println("文件可读");

		}
		System.out.println(file.canWrite() ? "文件可写" : "文件不可写");
		System.out.println(file.isFile() ? "是一个文件" : "是一个目录");
		System.out.println(file.isAbsolute() ? "是一个绝对路径" : "是一个相对路径");
		long zhxgsjc = file.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println("最后修改时间是" + sdf.format(new Date(zhxgsjc)));
		System.out.println("文件大小为:  " + file.length()+"bytes");
		System.out.println("是否成功删除文件" + file.delete());
	}

}
