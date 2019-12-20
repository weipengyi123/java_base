package com.school;

import javax.management.loading.PrivateClassLoader;

public class Student {
	//定义两个成员变量
	//private:类可见性 当前属性只能在本类中被访问
	//将成员变量定义为私有的，就是类的封装
	//外部方法要访问这个成员变量，必须通过公有的getter setter方法
	private String name;//字符串类型的姓名
	private int score;	//整型的成绩
	//如果没有定义任何构造方法，java虚拟机会自动创建一个无参的构造方法
	//如果有了带参数的构造方法，java虚拟机将不会自动创建一个无参的构造方法
	//不管什么情况，都给类添加一个无参数的构造方法
	//set 设置; get 获取
	
	//定义无参的构造方法
	//构造方法是一种特殊的方法：修饰符+类名([参数类型 参数名]){}
	public Student() {
		
		// TODO 自动生成的构造函数存根
	}
	//定义有参的构造方法
		public Student(String name, int score) {
			super();
			this.name = name;
			this.score = score;}
		
		
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
