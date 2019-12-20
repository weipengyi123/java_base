package com.jr181;

public class Recursive {
	public static int getSum (int n) {
		//最终参数值
		if (n==1) {
			//满足条件，递归结束
			return 1;
		}
		int temp=getSum(n-1);
		//除了1以外，都加上他前面的元素的和以及元素本身
			return temp+n;
		
	}

	public static void main(String[] args) {
		int sum=getSum(100);
		System.out.println("1到100的和为"+sum);

	}

}
