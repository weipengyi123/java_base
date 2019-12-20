package com.str;

import java.util.HashSet;
import java.util.Random;

public class S_shuangseqiu {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖结果：");
		System.out.println("六个红球号码为：");
		Random r = new Random();

		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < 10000; i++) {
			int red = r.nextInt(33) + 1;
			if (hs.size() == 6) {
				break;
			}
			hs.add(red);
		}
		for (Integer red : hs) {
			System.out.print(red + "  ");
			Thread.sleep(1000);
		}
		System.out.println("\n一个蓝球号码为：");
		int blue = r.nextInt(16) + 1;
		System.out.print(blue + "  ");
		Thread.sleep(500);
	}

}
