package com.str;

public class Baozhuanglei {

	public static void main(String[] args) {
		int a=20;
		//自动装箱：将基本的类型变量a赋给Integer类型的变量
		Integer b=a;
		//自动拆箱：将Integer类型的变量b赋给基本类型的变量
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		//字符串转换为整数的三种方法
		String s="88";
		String s1=s+10;
		System.out.println("字符串连接的结果是"+s1);
		System.out.println("No1:通过包装类的valueOf方法");
		int i_1=Integer.valueOf(s);
		System.out.println(i_1+10);
		System.out.println("\nNo2:通过包装类的parseXxx方法");
		int i_2=Integer.parseInt(s);
		System.out.println(i_2+10);
		System.out.println("\nNo3:通过包装类的构造方法");
		int i_3=new Integer(s);
		System.out.println(i_3+10);
		//整数转换为字符串的三种方法
		Integer j=88;
		System.out.println("\nNo1:通过String类的静态valueOf方法");
		String s_1=String.valueOf(j);
		System.out.print(s_1);
		System.out.println("\nNo2:通过包装类的toString方法");
		String s_2=j.toString();
		System.out.print(s_2);
		System.out.println("\nNo3:通过空串连接整数的方法");
		String s_3=""+j;
		System.out.print(s_3);
	}

}
