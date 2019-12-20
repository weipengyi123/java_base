package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_test {

	public static void main(String[] args) {
		Path path=Paths.get("E:\\安卓开发\\android studio\\build.txt");
		//输出path对象中的信息
		System.out.println("path的根路径："+path.getRoot());
		System.out.println("path的父路径："+path.getParent());
		System.out.println("path中的路径名称数："+path.getNameCount());
		//循环输出路径名称
		for (int i = 0; i < path.getNameCount(); i++) {
			//获取指定索引的路径名称
			Path name=path.getName(i);
			System.out.println("索引为："+i+"的路径名称为："+name);
			
		}
		System.out.println("path的URI路径为："+path.toUri());
		System.out.println("path的绝对路径为："+path.toAbsolutePath());
	}

}
