package com.str;

public class E5_4 {

	public static void main(String[] args) {
		String s="     http:/localhost:8080    ";
		//去掉字符串两端的空格
		System.out.println("去掉字符串两端空格的结果:"+s.trim());
		//把空格字符串替换为空字符串
		System.out.println("去掉字符串所有空格的结果:"+s.replace(" ",""));
		//用正则表达式把空格字符串替换为空字符串
		//第一个
		System.out.println("去掉字符串所有空格的结果:"+s.replaceAll("\\s+",""));
		
	}

}
