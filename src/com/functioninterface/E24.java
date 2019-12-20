package com.functioninterface;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
//定义一个类，并在类中定义一个静态方法
class Math{
	//定义一个求绝对值的方法
	public static int abs(int num) {
		if (num<0) {
			return -num;
		} else {
			return num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		// 使用lambda表达式
		printAbs(-10,n->Math.abs(n));
		//使用方法引用的方式  类名：静态方法名  来替换lambda表达式
		printAbs(-50,Math::abs);
		
	}

	private static void printAbs(int i, Calcable c) {
		// calc方法在这里是用求绝对值来实现
				System.out.println(c.calc(i));
	}




}
