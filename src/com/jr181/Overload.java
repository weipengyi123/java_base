package com.jr181;


//在一个类里，若干个方法的名字相同
//这些相同的方法，或者参数个数不一样，或者参数类型不一样，或返回值类型不一样，就叫方法重载
public class Overload {
	//1.实现两个整数相加
	public static int add(int x,int y) {
		return x+y;
	}
	//2.实现三个整数相加
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	//3.实现两个小数相加
	public static double add(double x,double y) {
		return x+y;
	}

	
	

}
