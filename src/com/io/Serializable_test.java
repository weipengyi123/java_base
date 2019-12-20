package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serializable_test {

	public static void main(String[] args) throws Exception {
		/*
		 * Person p1 = new Person(20, "Mike"); FileOutputStream fout = new
		 * FileOutputStream("person.txt"); ObjectOutputStream oout = new
		 * ObjectOutputStream(fout); oout.writeObject(p1);
		 */
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("person.txt"));
		Person p = (Person) oin.readObject();
		System.out.println(p);

	}

}
