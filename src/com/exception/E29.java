package com.exception;

public class E29 {

	public static void main(String[] args) {
		int result=devide(4,0);
		if(result==-1){
			System.out.println("程序异常");
		}
		else {
			System.out.println(result);
		}
		

	}

	private static int devide(int x, int y) {
	try {
		int result=x/y;
		return result;
		
	} catch (Exception e) {
		System.out.println("捕获的异常信息为:"+e.getMessage());
	}finally {
		System.out.println("不论程序是否异常，上面都做了一个除法");
	}
		return -1;
		
	}	
		
	
}
