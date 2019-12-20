package com.str;

public class E5_2 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println("数组a的长度是"+a.length);
		String s="vjcdhgsdvjfc.txt";
		//可以将字符串看成一个字符数组，下标从0开始
		System.out.println("字符串s的 第一个字符为"+s.charAt(0));
		System.out.println("字符串s的 第二个字符为"+s.charAt(1));
		System.out.println("字符串s的长度是"+s.length());
		//'A'=65 'a'=97 'b'=98  'c'=99
		System.out.println("字符串s中字符c第一次出现的位置是"+s.indexOf(99));
		//方法的名字遵循驼峰原则：除了第一个英语单词是首字母小写
		//后面的英语单词都是首字母大写
		System.out.println("字符串s中字符c最后一次出现的位置是"+s.indexOf('c'));
		System.out.println("字符串s中子字符串vj第一次出现的位置是"+s.indexOf("vj"));
		System.out.println("字符串s中子字符串vj最后次出现的位置是"+s.indexOf("vj"));
		//endsWith判断 是否以某个子字符串结尾		
		System.out.println("字符串是否以.txt"+s.endsWith(".txt"));
		//startsWith判断 是否以某个子字符串开头
		System.out.println("字符串是否以vjc"+s.startsWith("vjc"));
		//contains判断是否包含某个子串
		System.out.println("字符串s包含vjc吗"+s.contains("vjc"));
		//isEmpty()判断是否是空串
		System.out.println("字符串是空串吗"+s.isEmpty());
}
}
