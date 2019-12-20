package com.jr181;

public class E06 {

	public static void main(String[] args) {
		int x=0;					//定义变量x，初始值为0；
		int y=0;					//定义变量y，初始值为0；
		int z=0;					//定义变量z，初始值为0；
		boolean a,b;				//定义boolean变量a和b;
		//&是逻辑与，他的左边 x>0 => false,仍然要判断右边是真是假
		a=x>0 &y++>1;				//逻辑运算符 & 对表达式进行计算，然后将结果复制给a;
		System.out.println("a="+a);
		System.out.println("y="+y);
		//&是短路与，他的左边 x>0 => false,不需                                                                                                                                                                                                                                                                                                要判断右边是真是假
		b=x>0 &&z++>1;				//逻辑运算符 && 对表达式进行计算，然后将结果复制给b;
		System.out.println("b="+b);
		System.out.println("z="+z);
		//条件运算符
		int store=12;
		System.out.println(store<=0?"没有库存了":store>100?"库存太多啦":"库存量是"+store);

	}

}
