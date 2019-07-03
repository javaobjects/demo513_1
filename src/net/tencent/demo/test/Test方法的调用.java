package net.tencent.demo.test;

public class Test方法的调用 {

	/**
	 * 方法的调用分两种情况：
	 * 
	 * 1：static修饰的方法：  类名.方法名(实际参数)
	 * 2. 非static修饰的方法：
	 * ①先把方法所在的类实例化： Test方法的定义 t=new Test方法的定义();
	 * ②然后调用：    t.isPrime2(17);//对象名.方法名(实际参数)
	 * 
	 * 3.没有返回值的方法：
	 * 
	 * 注意：方法调用完不要声明变量接收方法的返回值即可，因为没有返回值
	 * 
	 */
	
	public static void main(String[] args) {
		//1.判断213是不是质数
		
		 boolean result=Test方法的定义.isPrime(17);
		 
		 System.out.println(result);
		 
		 //2.求出23和34 的和
		 int tmp=Test方法的定义.sum(23, 34);
		 System.out.println(tmp);
		 
		 //3.判断17是不是质数，要求调用非static修饰的isPrime方法
		 Test方法的定义 t=new Test方法的定义();
		 boolean result2=t.isPrime2(17);
		 System.out.println("17是质数吗："+result2);
		 
		  //4.调用没有返回值的方法
		 Test方法的定义.printName("telangpu");
	}
	
}
