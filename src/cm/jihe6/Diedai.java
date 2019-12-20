package cm.jihe6;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		// mgys 每个元素
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		//lambda表达式遍历集合里每个元素
		System.out.println("\n1:lambda表达式遍历集合里每个元素");
		list.forEach(duixiang->System.out.print(duixiang+"  "));
		
		//通过迭代对象遍历集合里每个元素
		System.out.println("\n2:通过迭代对象遍历集合里每个元素");
		
		Iterator<String> diedai=list.iterator();
		while (diedai.hasNext()) {
			Object mgys=(Object)diedai.next();
			System.out.print(mgys+"  ");
		}
		
		//针对迭代通过lambda表达式遍历集合里每个元素
		System.out.println("\n3:针对迭代通过lambda表达式遍历集合里每个元素");
		@SuppressWarnings("unused")
		Iterator<String> diedai2=list.iterator();
		list.forEach(duixiang->System.out.print(duixiang+"  "));
		
		
		
		//通过Foreach遍历集合里每个元素
		System.out.println("\n4:Foreach遍历集合里每个元素");
		//用Foreach循环输出
		for(Object dqys:list) {
			System.out.print(dqys+"  ");
		}
	}

}
