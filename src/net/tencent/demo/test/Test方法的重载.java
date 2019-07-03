package net.tencent.demo.test;

public class Test方法的重载 {
	/*
	 * 方法的重载就是在同一个类中允许同时存在一个以上同名的方法
	 * 这种情况的出现是有条件的：
	 * 
	 * 1.方法名相同
	 * 2.一个不同，方法的参数必须不同：参数个数不同  or 参数类型不同
	 */
	public void add(int a)
	{
		
	}
	
	public void add(double b)
	{
		
	}
	
	public void add(float f)
	{
		
	}
	
	public void add(int a,int f)
	{
		
	}
	
	public int add(int c,int d,int e)
	{
		//Arrays.to
		return 0;
	}
}
