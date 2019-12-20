package cm.jihe6;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashSet_test2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// 左边的类或接口必须比右边的类大或相等
		Map<String,String> hm = new LinkedHashMap<String,String>();
		// map存储元素是：键key+值value=对entry
		hm.put("1", "Jack");
		hm.put("2", "Rose");
		hm.put("3", "Lucky");
		hm.put("1", "Peter");
		System.out.println(hm);
		// jianji 键集
		Set jianji = hm.keySet();
		Iterator<String> diedai = jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = hm.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println("遍历键值对输出");
		Set<Map.Entry<String,String>>  jianzhidui = hm.entrySet();
		Iterator<Map.Entry<String,String>>  diedai2 = jianzhidui.iterator();
		while (diedai2.hasNext()) {
			Map.Entry Key_value = (Map.Entry) diedai2.next();
			Object key = Key_value.getKey();
			Object value = Key_value.getValue();
			System.out.println(key + ":" + value);
		}

		System.out.println("foreach遍历集合输出");
		// 等价于第27-33行代码
		hm.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println("遍历值输出");
		Collection zhiji = hm.values();
		zhiji.forEach(zhi -> System.out.println(zhi));

	}

}
