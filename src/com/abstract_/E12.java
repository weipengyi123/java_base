package com.abstract_;


	abstract class Animal{					//定义抽象类Animal
		
		public abstract void shout();		//定义抽象方法shout
}
	class Dog extends Animal{				//定义Dog类继承抽象类Animal
		//必须重写父类中的抽象方法
		@Override
		public void shout() {				//实现抽象方法shout
			System.out.println("汪汪汪......");
		}
	}
//定义测试类
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();					//创建Dog类的实例对象


		dog.shout();						//调用Dog对象的shout()方法



	}

}
