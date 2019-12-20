package cm.jihe6;

import java.util.Arrays;

public class Arrays_tool {

	public static void main(String[] args) {
		int arr[] = { 6, 9, 3, 5, 1, 0 };
		System.out.println("排序前:");
		printArray(arr);
		System.out.println();
		Arrays.sort(arr);				//对元素进行排序
		System.out.println("排序后:");
		printArray(arr);
		//2.
		//int index=Arrays.binarySearch(arr, 3);	//查找指定元素3
		System.out.println("\n元素3的指引是:"+Arrays.binarySearch(arr, 3));
		
		//3.使用copyOfRange(int[] original,int from,int to) 方法拷贝元素
		int[]copied=Arrays.copyOfRange(arr, 1, 7);
		for (int i1 = 0; i1 < copied.length; i1++) {
			System.out.print(copied[i1]+" ");
		
		//4.使用fill(Object[]a,Object val)方法替换
			Arrays.fill(arr, 8);
			printArray(arr);
		}
	}
	
	

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j + " ");

		}

	}

}
