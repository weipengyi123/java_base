package cm.jihe6;

public class Foreach_test {
	static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		// mgys 每个元素
		// 用Foreach循环来写，可以吗
		for (@SuppressWarnings("unused") String mgys : strs) {
			mgys="ddd";
		}
		System.out.println("Foreach循环修改后的结果："+strs[0]+" "+strs[1]+" "+strs[2]+" ");
		// 用For循环来写，可以吗
		for (int i = 0; i < strs.length; i++) {
			strs[i]="ddd";
			System.out.println("For循环修改后的结果："+strs[0]+" "+strs[1]+" "+strs[2]+" ");
		}
	}

}
