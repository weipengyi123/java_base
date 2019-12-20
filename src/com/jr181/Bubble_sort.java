package com.jr181;

public class Bubble_sort {

	public static void main(String[] args) {
		// 数组的特征是中括号，这个中括号可以在数组名之前或之后
		//可以有空格，也可以没有空格，但是一定要在数据类型之后
	int a[]	= {9,8,3,5,2,12};
	System.out.println("数组a的长度是"+a.length);
	//数组下标的最大值是数组长度减1
	System.out.print("初始数组各个元素是:");
	//foreach循环  读作：each in
	for (int xiaoa:a) {
		System.out.print(xiaoa+"  ");
	}
	
	
	//外循环定义趟数
	for (int i=1;i<a.length;i++) {
		//内循环定义每一趟的比较
		for (int j=0;j<a.length-i;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
			}
		}
	}
	System.out.print("\n冒泡排序结束后各个元素是:");
	//foreach循环  ':'读作：each in
	for (int xiaoa:a) {
		System.out.print(xiaoa+"  ");
	}
	
	}

}
