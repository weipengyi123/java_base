package com.net.chat;

import java.net.DatagramSocket;
import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) throws Exception {
		// 创建Scanner对象，包装控制台输入
		/*Scanner sc = new Scanner(System.in);
		// 提示用户输入聊天服务开启的端号
		System.out.println("请输入聊天服务开启的端口号");*/
		// 用Scanner对象接收用户输入的整数，作为程序要开启的UDP端口号
		/*int port = sc.nextInt();
		System.out.println("聊天程序系统初始化完成");*/
		// 创建UDP套接字
		DatagramSocket sender_socket = new DatagramSocket(5000);
		DatagramSocket receiver_socket = new DatagramSocket(3000);
		// 分别启动接收端和发送端程序

		new Thread(new ChatReceiver(receiver_socket), "接收程序").start();
		new Thread(new ChatSender(sender_socket, 3000), "发送程序").start();

	}

}
