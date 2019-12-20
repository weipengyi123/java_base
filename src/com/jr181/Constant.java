package com.jr181;

public class Constant {

	public static void main(String[] args) {
		//整型变量198
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		//0123456789abcdef
		System.out.println("十六进制以0x开头"+0xc6);
		System.out.println("5.022f="+5.022f);

		//单精度浮点数后面以f或F结尾；
		System.out.println("5.022e+6f="+5.022e+6f);
		//双精度浮点数以d或D结尾，这个d可以不写；
		System.out.println("5.022e+6d="+5.022e+6d);
		System.out.println("我的名字是："+'\u536b'+'鹏'+'\u6021');
		
		//字符串常量
		System.out.println("Welcome,\nMr.何!");
		//布尔常量
		System.out.println("布尔常量"+true+"或"+false);
		//null常量
		System.out.println("引用数据类型"+null);
		//基本数据类型的变量不能赋值为null;
		int a=5;
		//a=null;
		//引用数据类型的变量可以赋值为null;
		Constant Constant=new Constant();
		Constant=null;
		//如果在类型的前面加上final关键字作为修饰符，那么被修饰的变量就称为常量
		//他不是字面上的常量
		final int B=6;
		//b=7;

	}

}
