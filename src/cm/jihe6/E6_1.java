package cm.jihe6;

import java.util.ArrayList;
import java.util.LinkedList;

public class E6_1 {

	public static void main(String[] args) {
		//创建ArrayList集合    <>表示泛型，也就是集合里的元素类型
		ArrayList<String> list=new ArrayList<String>();
		//向集合中添加元素
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度:"+list.size());
		System.out.println("第2个元素是:"+list.get(1));
		
		//P197 5-2
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("s1");
		list2.add("s2");
		System.out.println(list2);
		list2.offer("offer");
		list2.push("push");
		System.out.println(list2);
		System.out.println("第一个元素是"+list2.get(0));
		System.out.println("第一个元素是"+list2.peek());
		list2.removeFirst();
		list2.pollLast();
		System.out.println(list2);
	}

}
