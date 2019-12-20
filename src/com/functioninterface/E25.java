package com.functioninterface;
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}

public class E25 {

	public static void main(String[] args) {
		StringUtils s=new StringUtils();
		PrintUpper("Hello",str->s.printUpperCase(str));
		PrintUpper("Mr.何",s::printUpperCase);
	}



	private static void PrintUpper(String string, Printable pt) {
		pt.print(string);
		
	}

}
