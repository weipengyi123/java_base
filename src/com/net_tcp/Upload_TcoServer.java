package com.net_tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerThread implements Runnable {
	private Socket socket;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		String ip = socket.getInetAddress().getHostAddress();
		String count = "卫鹏怡";
		try {
			File parentFile = new File("d:\\upload\\");
			if (!parentFile.exists()) {
				parentFile.mkdir();
			}
			File file = new File(parentFile, ip + "(" + count + ").jpg");
			while (file.exists()) {
				file = new File(parentFile, ip + count);
				// 通过客户端
			}
			InputStream in = socket.getInputStream();
			FileOutputStream fos = new FileOutputStream(file);
			byte[] zjhc = new byte[1024];
			int len = 0;
			while ((len = in.read(zjhc)) != -1) {
				fos.write(zjhc, 0, len);
			}
			OutputStream out = socket.getOutputStream();
			out.write("上传成功".getBytes());
			in.close();
			fos.close();
			socket.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}

public class Upload_TcoServer {

	public void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8899);
		while (true) {
			Socket client = serverSocket.accept();
			new Thread(new ServerThread(client)).start();
		}

	}

}
