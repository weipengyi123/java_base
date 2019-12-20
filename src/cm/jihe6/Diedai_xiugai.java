package cm.jihe6;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		// mgys 每个元素
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println(list);
		//等号右边通过list对象调用迭代方法
		//等号左边声明等号右边返回的迭代对象
		Iterator<String> diedai=list.iterator();
		//通过迭代对象判断是否有一个元素
		while (diedai.hasNext()) {
			String mgys=(String)diedai.next();
			if(mgys.equals("stu2")) {
				diedai.remove();
			}
		}
		System.out.println(list);
	}

}
