package cm.jihe6;

import java.util.Comparator;

import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("rawtypes")
class MyComparator2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String key1 = (String) o1;
		String key2 = (String) o2;
		//return key1.compareTo(key2);  升序
		return key2.compareTo(key1);//降序
	}

}

public class TreeMap_test {

	public static void main(String[] args) {
		// 左边的类或接口必须比右边的类大或相等
		@SuppressWarnings("unchecked")
		Map<String,String> tm = new TreeMap<String,String>(new MyComparator2());
		// map存储元素是：键key+值value=对entry
		tm.put("1", "Jack");
		tm.put("2", "Rose");
		tm.put("3", "Lucky");
		tm.put("1", "Peter");
		System.out.println(tm);

	}

}
