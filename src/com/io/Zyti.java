package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Zyti {
	static HashMap<String, Integer> hm=new HashMap<>();

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=new FileInputStream("18rj1.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		String xsm=br.readLine();
		while(xsm!=null) {
			hm.put(xsm,0);
			xsm=br.readLine();
		}
		//System.out.println(hm);
		File file=new File("D:\\18软件1班作业");
		fileDir(file);
		System.out.println(hm);
	}

	private static void fileDir(File file) {
		File[] Files=file.listFiles();
		//当前文件夹下每一个文件f
		for(File f :Files) {
			//如果是目录
			if(f.isDirectory()) {
				//统计名字出现的次数
				String wjm=f.getName();
				hm.forEach((xsm,cs)->{
					if(wjm.contains(xsm)) {
						cs=cs+1;
						hm.put(xsm, cs);
					}
				});
				fileDir(f);
			}
		}
		
		
	}

}
