package com.jr181;

import com.school.Test;

public class TestP102 {
	public TestP102() {
		System.out.println("构造方法一被调用了");
	}
	public TestP102 (int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public TestP102 (boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	
	public static void main(String[] args) {
		TestP102 test=new TestP102(true);

	}

}
