package com.str;


public class E5_8 {
	static String str="j1s我b3爱jk9fs3zl你4a3v8ax1c中3n4hc国3f";
	static StringBuffer zfchc=new StringBuffer();
	
	public static void main(String[] args) {
		
		
		
		char[] charArray=str.toCharArray();
		for (char zf:charArray) {
			if (zf>='\u4e00'&&zf<='\u9fa5') {
				zfchc.append(zf);
			}
		}
		System.out.println(zfchc);
		Add();
		delete();
		update();
	}
	//修改
	private static void update() {
		zfchc.replace(2, 4, "香港");
		System.out.println(zfchc);
	}
	//删除
	private static void delete() {
		zfchc.delete(2,4);
		System.out.println(zfchc);
		
	}
	//添加
	private static void Add() {
		zfchc.append('!');
		System.out.println(zfchc);
		zfchc.insert(3, ',');
		System.out.println(zfchc);
		
	}

}
