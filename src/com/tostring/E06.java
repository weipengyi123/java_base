package com.tostring;



//定义Animal类
class Animal extends java.lang.Object{
	void shout() {
		System.out.println("动物叫");
	}
	
	//重写父类Object中的toString方法
	@Override
	public String toString(){
		return "这是一只动物";
}
}
class Dog extends Animal{
	@Override
	public String toString(){
		return "这是一只小狗";
	}
}

public class E06 {
//定义测试类
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog xg=new Dog();
		System.out.println(animal.toString());
		System.out.println(xg);

	}
}

