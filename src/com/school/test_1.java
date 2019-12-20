package com.school;

public class test_1 {

	public static void main(String[] args) {
		// 创建对象：类名 对象名 =new 构造方法；
		Student s1=new Student();
		s1.setName("大狗子");
		s1.setScore(600);
		System.out.println(s1.getName()+"考了"+s1.getScore());
		Student s2=new Student("小狗子",560);
		System.out.println(s2.getName()+"考了"+s2.getScore());
		
		Course c1=new Course();
		c1.setCourse_name("java程序设计");
		c1.setCourse_book("java基础入门");
		System.out.println(c1.getCourse_name()+"这门课使用的教材是《"+c1.getCourse_book()+"》");
	}

}
