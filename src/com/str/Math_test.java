package com.str;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("计算绝对值的结果"+Math.abs(-5));
		System.out.println("计算正弦的结果"+Math.sin(-5));
		System.out.println("计算余弦的结果"+Math.cos(-5));
		System.out.println("计算正切的结果"+Math.tan(-5));
		System.out.println("计算 平方根的结果"+Math.sqrt(4));
		System.out.println("计算立方根的结果"+Math.cbrt(8));
		System.out.println("计算乘方的结果"+Math.pow(3,5));
		
		//ceil 天花板  floor地板
		System.out.println("计算大于参数的最小整数"+Math.ceil(3.2));
		System.out.println("计算小于参数的最小整数"+Math.floor(3.2));
		System.out.println("计算四舍五入"+Math.round(-5.2));
		System.out.println("求两个数的较大值"+Math.max(5.6,5.8));
		System.out.println("求两个数的较小值"+Math.min(5.6,5.8));
		System.out.println("生成一个大于等于0.0小于等于1.0的随机值"+Math.random());
		System.out.println("强制取整"+(int)(5.6));
	}


	

}
