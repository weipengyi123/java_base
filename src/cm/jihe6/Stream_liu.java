package cm.jihe6;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;
import java.util.Arrays;

public class Stream_liu {

	public static void main(String[] args) {
		//创建1个数组
		Integer[]array= {9,8,3,5,2};
		//将数组转换为List集合
		List<Integer> list=Arrays.asList(array);
		//1.使用集合对象的stream()静态方法创建Stream流对象
		Stream<Integer>stream=list.stream();
		stream.forEach(i->System.out.println(i+" "));
		System.out.println();
		

	}

}
