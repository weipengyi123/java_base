package com.inner_class;

//定义外部类
class outer{
	static int m=0;
	void test1() {
		System.out.println("外部类成员方法");
	}
	void test2() {
		//1.定义局部内部类Inner,在局部内部类中访问外部类变量和方法 
		class Inner{
			int n=1;
			void show() {
				System.out.println("外部变量m="+m);
				test1();
			}
		}
		//2.在创建局部内部类的方法中，调用局部内部类变量和方法
		Inner inner=new Inner();
		System.out.println("局部内部变量n="+inner.n);
		inner.show();
	}
	static class Inner{
		void show() {
			//静态内部类访问外部静态成员
			System.out.println("外部类静态变量m="+m);
		}
	}
}
public class E19 {

	public static void main(String[] args) {
		outer outer=new outer();
		outer.test2();			//通过外部类对象调用创建了局部内部类
		//静态内部类可以直接通过外部类创建
		outer.Inner inner=new outer.Inner();
		inner.show();
	}

}
