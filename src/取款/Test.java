package 取款;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		// 
		int[] a={1,56,89,100,2,4,32};
		
		//需求：把数组排序后传给其他接口
		
		Arrays.sort(a);//sort方法就是别人封装好的方法
		
		System.out.println(Arrays.toString(a));
	}

}
