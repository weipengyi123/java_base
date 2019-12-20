package com.hanshujiekou;
@FunctionalInterface
interface Printable{
	void print(StringUtils su,String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E27 {

	public static void main(String[] args) {
		//new StringUtils()对应lambda表达式里的object参数
		//hello对应lambda表达式里的t参数
		printUpper(new StringUtils(),"hello",(object,t)->object.printUpperCase(t));
		
		printUpper(new StringUtils(),"mr.何",StringUtils::printUpperCase);
	}
	

	private static void printUpper(StringUtils su, String str, Printable pt) {
		pt.print(su, str);
		
	}

}
