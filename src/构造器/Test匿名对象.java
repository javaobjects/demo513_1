package 构造器;

import java.util.Date;

public class Test匿名对象 {

	public static void main(String[] args) {

		//输出当前日期 Java的类除咯lang包都要导包
//		Date date = new Date();
//		System.out.println(date.toString());
//		System.out.println(date);
		
//		System.out.println(new Date().toString());//这就是匿名对象
//		System.out.println(new Date());//这就是匿名对象
		
		for (int i = 0; i < 10000; i++) {
			Date date = new Date();
		}
	}

}
