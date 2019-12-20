package cm.jihe6;

import java.util.HashSet;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return name.equals(other.name);
	}
}
public class HS_test {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(new Person("jack", 20));
		hs.add(new Person("jack", 19));
		hs.add(new Person("Rose", 18));
		System.out.println(hs);
	}

}
