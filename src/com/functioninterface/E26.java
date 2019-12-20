package com.functioninterface;



@FunctionalInterface
interface PersonBuilder{
	Person builderPerson(String name);
}
class Person{
	private String name;

	public Person(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
public class E26 {

	public static void main(String[] args) {
		PrinteName("          ♥   肖 战",new PersonBuilder() {
			
			@Override
			public Person builderPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
		});
		PrinteName("      ♥    王一博",name->new Person(name));
		PrinteName("  ♥    大 神",Person::new);
	}

	private static void PrinteName(String string, PersonBuilder pb) {
		System.out.println(pb.builderPerson(string).getName());
		
	}

}
