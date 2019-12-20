package cm.jihe6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class juhecaozuo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("王一博");
		list.add("肖战");
		list.add("王毛");
		list.add("王二狗");
		list.add("王小狗");
	//1.创建一个stream流对象
		Stream<String>stream=list.stream();
	//2.对stream流中的元素分别进行过滤、截取操作
		Stream<String>stream2=stream.filter(i->i.startsWith("王"));
		Stream<String>stream3=stream2.limit(2);
	//3.对stream流中的元素进行终结操作，进行遍历输出
		stream3.forEach(j->System.out.println(j));
		System.out.println("============");
	//通过链式表达式的形式完成聚合操作
	//filter:里面元素类型为字符串
	//skip:省略掉前面几个 limit:一共取几个
	//forEach:遍历
		list.stream().filter(i->i.startsWith("王")).filter(h->h.length()>2).limit(4).skip(2).forEach(j->System.out.println(j));
	//collect:收集方法
		List<String> xlb=list.stream().filter(y->y.startsWith("王")).collect(Collectors.toList());
		System.out.println(xlb);
		String string=list.stream().filter(y->y.startsWith("王")).collect(Collectors.joining(" 和 "));
		System.out.println(string);

	}

}
