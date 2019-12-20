package cm.jihe6;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		return s1.length()-s2.length();
		
	}
	
}
public class E6_13 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		//如果使用TreeSet默认的比较器插入字符串，则会使字符串类的compareTo方法
		//按照英文字母或者数字的顺序进行排序插入集合
		//如果使用自定义的比较器MyComparator插入字符串，则会使自定义的比较器类compare方法
		//按照字符长度的顺序进行排序插入集合，如果长度相同，则TreeSet认为是同一个元素，无法插入
		ts.add("stu1");
		ts.add("stu2");
		ts.add("stu3");
		ts.add("stu6");
		System.out.println(ts);

	}

}
