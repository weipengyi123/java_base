package com.gc;
class Person{
	//重写父类object中的finalize()方法
	@Override
	public void finalize() {
		System.out.println("对象将被当做垃圾回收");
	}
}
public class E37 {

	public static void main(String[] args) {
		lajihuishou1();
		System.out.println(".....................");
		lajihuishou2();
	}
	//演示一个不通知强制垃圾回收的方法
	private static void lajihuishou1() {
		Person p1=new Person();
		//使p1对象为空，也就是不再使用，变成垃圾
		p1=null;
		int i=1;
		while (i<10) {
			System.out.println("方法一循环中--------");
			i++;
		}

	}
	//演示一个通知强制垃圾回收的方法
	private static void lajihuishou2() {
		Person p2=new Person();
		p2=null;
	//强制垃圾回收
		System.gc();//等价于—— Runtime.getRuntime().gc()

		int i=1;
		while (i<10) {
			System.out.println("方法二循环中--------");
			i++;
		}
		
	}

}
