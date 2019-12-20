package com.jr181;

public class O_add {

	public static void main(String[] args) {
		// 求100以内奇数之和
		int sum=0;
		for(int i=1;i<=99;i=i+2){
			sum+=i;
		}
		System.out.println("sum="+sum);

	}

}
