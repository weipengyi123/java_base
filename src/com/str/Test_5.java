package com.str;

public class Test_5 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		//dglzfc 倒过来字符串
		String dglzfc=s.reverse().toString();
		System.out.println(dglzfc);
		StringBuffer kc=new StringBuffer();
		char[] zfsz=dglzfc.toCharArray();
		for (int i = 0; i < zfsz.length; i++) {
			char c = zfsz[i];
			if (Character.isUpperCase(c)) {
				String dxbxx=(""+c).toLowerCase();
				kc.append(dxbxx);
			}else if (Character.isLowerCase(c)) {
				String dxbxx=(""+c).toUpperCase();
				kc.append(dxbxx);
			}
			
		}
		System.out.println(kc);

	}

}
