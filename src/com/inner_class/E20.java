package com.inner_class;
interface Animal{
	void shout();
}
/*class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵..");
	}
}*/

public class E20 {

	public static void main(String[] args) {
		String name="花猫";
		//第一种方式
		//外部类  外部类的对象=new 外部类()创建对象
		//Cat cat=new Cat();
		//外部类的对象.方法名来调用方法实现功能
		//cat.shout();
		//第二种方式
		//匿名内部类
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println(name+"喵呜..");
				
			}
		});
		//第三种方式
		//用Lambda表达式作为参数传递给animalShout()方法输出
		//()对应shout方法后面的括号  -> 是表达式箭牌  {}里面的语句是方法主体
		animalShout(()->System.out.println(name+"喵呜.."));
	}
	private static void animalShout(Animal an) {
		an.shout();
	}

}
