package cm.jihe6;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(16);
		ts.add(12);
		ts.add(17);
		ts.add(21);
		ts.add(5);
		ts.add(19);
		System.out.println("创建的TreeSet集合为"+ts);
		System.out.println("TreeSet集合首元素为"+ts.first());
		System.out.println("TreeSet集合尾部元素为"+ts.last());
		System.out.println("TreeSet集合中小于或等于9的最大的一个元素为"+ts.floor(9));
		System.out.println("TreeSet集合中大于10的最小一个元素为"+ts.higher(10));
		ts.pollLast();
		System.out.println("TreeSet集合删除最后一个元素后"+ts);
	}

}
