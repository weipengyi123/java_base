package com.str;

import java.util.Random;

public class E5_16 {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("生成boolean类型的随机数"+r.nextBoolean());
		System.out.println("生成double类型的随机数"+r.nextDouble());
		System.out.println("生成float类型的随机数"+r.nextFloat());
		System.out.println("生成int类型的随机数"+r.nextInt());
		//生成0~10之间int类型的随机数 [0,10) 0~9  10个
		System.out.println("生成0~10之间int类型的随机数"+r.nextInt(10));
		System.out.println("生成long类型的随机数"+r.nextLong());
	}

}
