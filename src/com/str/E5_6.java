package com.str;



public class E5_6 {

	public static void main(String[] args) {
		String str="2019-10-12";
		//字符串截取
		System.out.println("今天是"+str.substring(8)+"号");
		System.out.println("本月是"+str.substring(5,7)+"月");
		System.out.println("今年是"+str.substring(0,4)+"年");

		
		String [] strArray=str.split("-");
		for (int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("今天是"+strArray[0]+"年"+strArray[1]+"月"+strArray[2]+"日");
		
		
		//P160页
		for (int i=0;i<strArray.length;i++) {
			if (i!=strArray.length-1) {
				System.out.print(strArray[i]+"/");
			}else {
				System.out.println(strArray[i]);
			}
		}
		
		//P189  三、2.
		String s="abcdedcba";
		System.out.println(s.substring(3,4));
	}

}
