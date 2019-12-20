package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket socket;
	private int port;

	public ChatSender(DatagramSocket socket, int port) {
		this.socket = socket;
		this.port = port;
	}

	@Override
	public void run() {
		// 创建Scanner对象，包装控制台输入
		Scanner sc = new Scanner(System.in);
		// 不断发送消息
		while (true) {

			try {
				System.out.println("请输入要发送的信息");
				// 定义要发送的数据
				String str = sc.nextLine();
				// 将字符串数据转换为二进制
				byte[] hcqsz = str.getBytes("UTF-8");
				System.out.println("请输入要发送的ip地址");
				String ip = sc.nextLine();
				DatagramPacket packet = new DatagramPacket(hcqsz, hcqsz.length, InetAddress.getByName(ip),
						port);
				socket.send(packet);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}

	}

}
