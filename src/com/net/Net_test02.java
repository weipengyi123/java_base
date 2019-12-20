package com.net;

import java.net.InetAddress;

public class Net_test02 {

	public static void main(String[] args) throws Exception {
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");
		System.out.println("本机 的IP地址是:"+localAddress.getHostAddress());
		System.out.println("itcast的IP地址是:"+remoteAddress.getHostAddress());
		System.out.println("3秒内是否可以访问:"+remoteAddress.isReachable(3000));
		System.out.println("itcast的主机名是:"+remoteAddress.getHostAddress());

	}

}
