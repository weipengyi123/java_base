package com.interface_;
//接口编译以后也是class文件

interface  Animal{					
	//接口中没有成员变量
	//只有public static final的成员变量
	//public static final三个关键字可以省略
	int ID=1;
	//abstract 抽象
	//接口中的方法都是public abstract
	//public abstract两个关键字可以省略
	void shout();	
	//接口里可以有静态非抽象的方法
	static int getID() {
		return Animal.ID;
	}
}
interface LandAnimal extends Animal{
	void run();
}


class Dog implements LandAnimal{				
	//必须重写父类中的抽象方法
	@Override
	public void shout() {				
		System.out.println("汪汪汪......");
	}
	public void run() {				
		System.out.println("大猪崽跑");
	}
}
//定义测试类
public class E13 {

public static void main(String[] args) {
	Dog dog=new Dog();					//创建Dog类的实例对象
	dog.shout();	
	dog.run();
	System.out.println(Animal.getID());

}

}
