package cm.jihe6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "何", "卫", "周", "高");
		System.out.println("排序前:" + list);
		// 反转
		Collections.reverse(list);
		System.out.println("反转后:" + list);
		// 排序   根据Java的字符编码，unicode编码的大小
		Collections.sort(list);
		System.out.println("按自然顺序排序后:" + list);
		// 随机
		Collections.shuffle(list);
		System.out.println("按随机排序后:" + list);
		// 首尾交换
		Collections.swap(list, 0, list.size()-1);
		System.out.println("首尾元素交换后:" + list);

	}

}
