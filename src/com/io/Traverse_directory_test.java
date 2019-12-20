package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

public class Traverse_directory_test {

	public static void main(String[] args) {
		File file=new File("E:\\2019-2020上半学期\\JAVA基础\\project\\java_base\\bin\\com\\abstract_");
		/*if(file.isDirectory()) {
			String[] fileNames=file.list((dir,name)->name.endsWith(".class"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}*/
		FileDir(file);
	}
	private static void FileDir(File file) {
		File[] listFiles=file.listFiles();
		//当前文件夹下每一个文件f
		for(File f :listFiles) {
			//如果是目录
			if(f.isDirectory()) {
				//输出目录
				System.out.println(f);
				FileDir(f);
				//输出文件
				System.out.println(f);
			}
		}
		
	}

}
