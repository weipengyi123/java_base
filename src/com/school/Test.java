package com.school;

public class Test {

	public static void main(String[] args) {
		//Student是类名  s1是这个类的对象名
		//new关键字用来创建一个Student类，类名后面要有小括号
		Student s1=new Student(); 
		
		s1.setName("Mr.何");
		s1.setScore(560);
		System.out.println(s1.getName()+"考了"+s1.getScore());
		

	}

}
