package cm.jihe6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("何", "卫", "周", "高");
		//使用单列集合的parallelStream方法创建并行流
		Stream<String> liu1=list.parallelStream();
		if (liu1.isParallel()) {
			System.out.println("liu1是一个并行流");
		}
		//使用单列集合的Stream方法创建串行流
		Stream<String> liu2=Stream.of("何", "卫", "周", "高");
		if (!liu2.isParallel()) {
			System.out.println("liu2是一个串行流");
		}
		//使用串行流的Parallel方法创建并行流
		Stream<String> liu3=liu2.parallel();
		if (liu3.isParallel()) {
			System.out.println("liu3是一个并行流");
		}
		
		
	}

}
