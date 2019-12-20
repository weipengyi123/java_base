package com.io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zifuhuanchong {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\1.管理学院全体学生信息（最新周报表2018.10.18）.xls");
		FileWriter fw=new FileWriter("D:\\1.管理学院全体学生信息（最新周报表2018.10.18）.xls");
		char[]buff=new char[1024];
		long kssj=System.currentTimeMillis();
		int len=fr.read(buff);
		while(len!=-1) {
			fw.write(buff, 0, len);
			len=fr.read(buff);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝这个文件"+(jssj-kssj)+"毫秒");
		fr.close();
		fw.close();

	}

}
