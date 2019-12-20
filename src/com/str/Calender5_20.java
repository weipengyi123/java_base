package com.str;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Calender5_20 {

	public static void main(String[] args) throws ParseException {
		Calendar calender=Calendar.getInstance();
		int year=calender.get(Calendar.YEAR);
		int month=calender.get(Calendar.MONTH)+1;
		int date=calender.get(Calendar.DATE);
		int hour=calender.get(Calendar.HOUR);
		int minute=calender.get(Calendar.MINUTE);
		int second=calender.get(Calendar.SECOND);
		System.out.println("当前时间为"+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
		
		calender.set(year,month,date);
		calender.add(calender.DATE, 100);
		year=calender.get(Calendar.YEAR);
		month=calender.get(Calendar.MONTH);
		date=calender.get(Calendar.DATE);
		System.out.println("100天以后是:"+year+"年"+month+"月"+date+"日");
		
		
		//P181 26行
		/*LocalDate localdate=LocalDate.now();
		System.out.println("从默认时区系统时钟获取当前时间"+localdate);
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println("100天以后是:"+localDateTime.plusDays(100));*/
		LocalDate localdate=LocalDate.now();
		LocalDate J_100=localdate.plusDays(100);
		System.out.println(J_100);
		
		
		//P186
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		//ybtyh_zfc  ：一百天以后字符串
		//将LocalDate对象的值改成String类的对象用toString方法
		String ybtyh_zfc=J_100.toString();
		//先通过SimpleDateFormat对一百天以后的字符串进行解析，用parse方法
		Date date_100=sdf1.parse(ybtyh_zfc);
		//再通过SimpleDateFormat对一百天以后的Date对象进行格式化，用format方法
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("100天以后是"+sdf2.format(date_100));
		
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd");
		String rqzfc="2018/01/27";
		Date date3=sdf3.parse(rqzfc);
		System.out.println(date3.toString());
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf4.format(date3));
		
		
		//比较2个字符串大小
		String str1="abc";
		String str2="abc";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3=new String("abc");
		String str4=new String("abc");
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
				
	}

}
