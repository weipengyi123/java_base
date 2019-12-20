package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Net_test01 {

	public static void main(String[] args) throws Exception {
	//定义一个指定端口号为3000的发送端DatagramSocket对象
		DatagramSocket client=new DatagramSocket(3000);
	//定义要发送的数据	
		String str="你俩都是猪";
	//将字符串数据转换为二进制
		byte[] hcqsz=str.getBytes("UTF-8");
		//将转换后的数据放到数据报里
		DatagramPacket packet=new DatagramPacket(hcqsz, hcqsz.length,InetAddress.getByName("10.2.103.34"),8900
				);
		System.out.println("开始发送信息....");
		//发送数据
		client.send(packet);
		//释放资源
		client.close();

	}

}
