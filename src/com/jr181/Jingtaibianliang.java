package com.jr181;
class Student{
	static String schoolName;				//声明静态变量schoolName
}
public class Jingtaibianliang {
	
	public static void main(String[] args) {
		Student stu1=new Student();			//创建第一个学生对象
		Student stu2=new Student();			//创建第二个学生对象
		Student.schoolName="江汉艺术职业学院";	//为静态变量赋值
											//分别输出两个学生对象的信息
		System.out.println("我是"+stu1.schoolName+"的学生");
		System.out.println("我是"+stu2.schoolName+"的学生");
	}

}
