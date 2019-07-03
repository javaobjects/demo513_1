package net.tencent.demo.test;

public class Test方法的定义 {

	public static void main(String[] args) {
		// 在main方法中定义方法的做法是错误的
		/*//定义一个方法
		public static int getCount()
		{
			
		}
		*/
		
		
	}
	
	//只要方法定义时声明了返回数据，那么方法体中return语句一定要得到执行的机会
	public int getFirst(int[] arr)
	{
		
		
		
		if(arr[0]>0)
		{
			return arr[0];
		}else
		{
			return 0;
		}
	}
	
	
	/*
	 * 方法的定义
	 * 1.有返回值的方法：      访问修饰符    【static】 数据类型  方法名(参数列表...){  //方法体  }
	 * 2.没有返回值的方法：  访问修饰符    【static】 void  方法名(参数列表...){  //方法体  }
	 * 3.不需要参数：             访问修饰符    【static】 数据类型  方法名(){  //方法体  }
	 */
	
	public static void printName(String name)
	{
		System.out.println(name);
	}
	

	/*
	 * 需求：算出两个整数的和，并返回
	 */
	public static int sum(int firstNumber, int secondNumber) {
		// 方法体
		int result = firstNumber + secondNumber;

		return result;
		// return firstNumber+secondNumber;
	}

	/*
	 * 需求：接收一个整数，判断它是不是质数，并返回结果boolean类型，true表示是，false表示不是
	 */
	public static boolean isPrime(int source) {
		// 套路：如果方法有返回值，那么先在方法体的第一行声明该返回值
		boolean result = true;
		
		/*
		 * 6:  1,6   2,3
		 * 
		 * 3:  1,3
		 * 
		 * 100:   2-99
		 */
		//思路：拿着这个数从2开始除，一直除到比source小1，不管除到谁，只要余数为0，那么这个数就不是质数
		for (int i = 2; i < source; i++) {
			if(source%i==0)
			{
				result=false;
				break;//循环不用继续，结束
			}
		}
		return result;
	}

	public boolean isPrime2(int source) {
		// 套路：如果方法有返回值，那么先在方法体的第一行声明该返回值
		boolean result = true;
		
		/*
		 * 6:  1,6   2,3
		 * 
		 * 3:  1,3
		 * 
		 * 100:   2-99
		 */
		//思路：拿着这个数从2开始除，一直除到比source小1，不管除到谁，只要余数为0，那么这个数就不是质数
		for (int i = 2; i < source; i++) {
			if(source%i==0)
			{
				result=false;
				break;//循环不用继续，结束
			}
		}
		return result;
	}
	
}
