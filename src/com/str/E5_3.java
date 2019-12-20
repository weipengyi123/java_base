package com.str;



public class E5_3 {

	public static void main(String[] args) {
		String str="j1s是b3大jk9fs3zl狗4a3v8ax1c子3n4hc鸭3f";
		char[]charArray=str.toCharArray();
		System.out.print("将将字符串转为字符数组的遍历结果");
		for (int i = 0; i < charArray.length; i++) {
			if (i!=charArray.length-1) {
				System.out.print(charArray[i]+",");
			} else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("字符串中的数字是:");
		//foreach循环
		//'0'=48  'a'=97 'b'=98  'c'=99 'A'=65
		for(char zf:charArray) {
			if (zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
			System.out.print("\n字符串中的汉字是:");
			//foreach循环
			//'0'=48  'a'=97 'b'=98  'c'=99 'A'=65
			for(char hz:charArray) {
				if (hz>='\u4E00'&&hz<='\u9FA5') {
					System.out.print(hz);
				}
		}
	System.out.println("\n将int值转换为String类型之后的结果"+String.valueOf(12));
		System.out.println("将i字符串转换成大写之后的结果"+str.toUpperCase());
	


	}
}


