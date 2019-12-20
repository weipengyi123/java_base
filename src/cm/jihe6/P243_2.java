package cm.jihe6;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class P243_2 {

	public static void main(String[] args) {
		
		Map<String,String>tm = new TreeMap<String,String>();
		// map存储元素是：键key+值value=对entry
		tm.put("4", "Aimee");
		tm.put("2", "John");
		tm.put("3", "Smith");
		tm.put("5", "Amanda");
		tm.put("1", "Lucy");
		System.out.println(tm); 
		
		System.out.println("遍历键值对输出");
		Set<String> jianji = tm.keySet();
		Iterator<String> diedai = jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = tm.get(key);
			System.out.println(key + ":" + value);
		}

	}

}
