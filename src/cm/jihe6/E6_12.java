package cm.jihe6;

import java.util.TreeSet;

@SuppressWarnings("rawtypes")
class Teacher implements Comparable{

		String name;
		int age;
		
	public Teacher(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	@Override
	public String toString() {
		return name+":"+age;
	}

	@Override
	public int compareTo(Object o) {
		Teacher teacher=(Teacher)o;
		return teacher.age-this.age;
	}
}
public class E6_12 {

	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("陈勇军", 30));
		ts.add(new Teacher("姜    帆", 32));
		ts.add(new Teacher("梅    方", 31));
		ts.add(new Teacher("张丽平", 33));
		System.out.println(ts);

	}

}
