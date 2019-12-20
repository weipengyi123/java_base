package cm.jihe6;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_test {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("jack");
		set.add("Eve");
		set.add("Rose");
		set.add("jack");//添加重复元素
		//遍历输出Set集合中的元素
		System.out.println(set);
		//无法向HashSet中插入重复元素，并且按照字母顺序排好
		//没有重复是因为Set重写了hasCode
		//按照字母顺序排好是因为String类重写了CompareTo方法
		//按照字母顺序排好是因为Integer类重写了CompareTo方法
		ArrayList<String> set1=new ArrayList<String>();
		set1.add("jack");
		set1.add("Eve");
		set1.add("Rose");
		set1.add("jack");//添加重复元素
		System.out.println(set1);
	

	}

}
