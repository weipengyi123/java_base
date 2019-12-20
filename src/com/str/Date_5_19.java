package com.str;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_5_19 {
	//日期类
	public static void main(String[] args) {
	Date date1=new Date();
	long d2=System.currentTimeMillis()+1000;
	Date date2=new Date(d2);
	System.out.println(date1);
	System.out.println(date2);
	//日期格式化类
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("Gyyyy年MM月dd日：今天是yyyy年的第D天，E");
			System.out.println(simpleDateFormat.format(new Date()));
	
		

	}

}
