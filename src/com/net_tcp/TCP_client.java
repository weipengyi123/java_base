package com.net_tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class TCP_client {

	public static void main(String[] args) throws IOException, IOException {
		//创建客户端套接字，参数是服务器的IP地址和服务器开放的端口号，连接服务器
		Socket khdtjz=new Socket("10.2.103.31", 8899);//khdtjz:客户端套接制
		//创建文件
		File wj=new File("d:\\卫鹏怡.jpg");
		//
		FileInputStream fin=new FileInputStream(wj);
		
		OutputStream os;
		os=khdtjz.getOutputStream();
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while (b!=-1) {
			os.write(zjhc);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		InputStream is=khdtjz.getInputStream();
		zjhc=new byte[1024];
		b=is.read(zjhc);
		while (b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read();
		}
		is.close();
		khdtjz.close();
		
	}

}
