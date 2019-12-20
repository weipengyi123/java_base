package cm.jihe6;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties sxj = new Properties();
		//load：加载文件 
		sxj.load(new FileInputStream("d:\\test.properties"));
		//通过Lambda表达式读取文件中的键和对应的值
		sxj.forEach((key, value) -> System.out.println(key + ":" + value));

		FileOutputStream out = new FileOutputStream("d:\\test.properties");
		// 定义要写入的文件名
		sxj.setProperty("charset", "UTF-8");
		// store：存储文件
		sxj.store(out,"新增charset编码");

	}

}
