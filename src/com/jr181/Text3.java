package com.jr181;

public class Text3 {

	public static void main(String[] args) {
		// 自动类型转换：隐式类型转换，从小类型到大类型
		byte b=3;
		int i=b;
		System.out.println("整型变量i的值是"+i);
		//强制类型转换：显式类型转换，从大类型到小类型
		int i2=3;
		byte b2=(byte)i2;
		System.out.println("字节型变量b2的值是"+b2);
		
		int i3=257;
		byte b3=(byte)i3;
		System.out.println("字节型变量b3的值是"+b3);
		
	}

}
