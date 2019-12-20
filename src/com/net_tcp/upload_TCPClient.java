package com.net_tcp;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class upload_TCPClient {

	public static void main(String[] args) throws Exception{
		Socket client = new Socket("10.2.103.87", 8899);
		OutputStream out = client.getOutputStream();
		FileInputStream fis = new FileInputStream("d:\\卫鹏怡.jpg");
		byte[] zjhc = new byte[1024];
		int len = 0;
		System.out.println("连接到服务器，开始文件上传");
		while ((len = fis.read(zjhc)) != -1) {
			out.write(zjhc, 0, len);
		}
		client.shutdownOutput();

		InputStream is = client.getInputStream();
		byte[] bufMsg = new byte[1024];
		int len2 = is.read(bufMsg);
		while (len2 != -1) {
			System.out.println(new String(bufMsg, 0, len2));
			len2 = is.read(bufMsg);
		}
		out.close();
		is.close();
		fis.close();
		client.close();

	}

}
