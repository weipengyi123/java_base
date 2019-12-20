package cm.jihe6;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Test test=new Test();
		
		ArrayList<String> arrayList=new ArrayList<>();
		long start1=System.currentTimeMillis();
		test.listTest(arrayList);
		long over1=System.currentTimeMillis();
		System.out.println("用ArrayList插入15万个元素消耗"+(over1-start1)+"毫秒");
		
		LinkedList<String> linkedList=new LinkedList<>();
		long start2=System.currentTimeMillis();
		test.listTest(linkedList);
		long over2=System.currentTimeMillis();
		System.out.println("用LinkedList插入15万个元素消耗"+(over2-start2)+"毫秒");
		
		
		
		long startTime1=System.currentTimeMillis();
		test.listRead(arrayList);
		long endTime1=System.currentTimeMillis();
		System.out.println("用ArrayList倒序读取15万个元素消耗"+(endTime1-startTime1)+"毫秒");
		
		
		long endTime2=System.currentTimeMillis();
		test.listRead(linkedList);
		long startTime2=System.currentTimeMillis();
		System.out.println("用LinkedList倒序读取15万个元素消耗"+(endTime2-startTime2)+"毫秒");
	}

}
class Test{
	public void listTest(List list) {
		//Random random=new Random();
		for (int i = 0; i < 150000; i++) {
			list.add(0,i);
		}
	}
	public void listRead(List list) {
		//Random random=new Random();
		for (int i = 150000-1; i >= 0; i--) {
			list.get(i);
		}
	}
}
