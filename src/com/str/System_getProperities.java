package com.str;
//util  工具
import java.util.*;

public class System_getProperities {

	public static void main(String[] args) {
		Properties xtsx=System.getProperties();	//xtsx
		//System.out.println(xtsx);
		Set<String> sxm=xtsx.stringPropertyNames();	//sxm
		//foeeach循环读出属性集里的内容
		for (String key : sxm) {
			String value=System.getProperty(key);
			System.out.println(key+"-->"+value);
		}

	}

}
