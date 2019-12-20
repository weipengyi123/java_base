package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cb=CharBuffer.allocate(6);
		System.out.println("缓冲器的容量是："+cb.capacity());
		System.out.println("缓冲器的界限值是："+cb.limit());
		System.out.println("缓冲器的初始位置值是："+cb.position());
		cb.put('a');
		cb.put('b');
		cb.put('c');
		System.out.println("缓冲器的界限值是："+cb.limit());
		System.out.println("缓冲器的位置值是："+cb.position());
		
		//反转
		cb.flip();
		System.out.println("反转之后的缓冲器容量是："+cb.capacity());
		System.out.println("反转之后的缓冲器界限值是："+cb.limit());
		System.out.println("反转之后缓冲器的初始位置值是："+cb.position());
		System.out.println("反转之后取出缓冲器的第一个值是："+cb.get());
		System.out.println("反转并取出缓冲器的第一个值之后的界限值是："+cb.limit());
		System.out.println("反转并取出缓冲器的第一个值之后的位置值是："+cb.position());
		
		//清除
		cb.clear();
		System.out.println("清除之后的缓冲器容量是："+cb.capacity());
		System.out.println("清除之后的缓冲器界限值是："+cb.limit());
		System.out.println("清除之后缓冲器的初始位置值是："+cb.position());
		System.out.println("清除之后取出缓冲器的第一个值是："+cb.get());
		System.out.println("清除并取出缓冲器的第一个值之后的界限值是："+cb.limit());
		System.out.println("清除并取出缓冲器的第一个值之后的位置值是："+cb.position());
		
	}

}
