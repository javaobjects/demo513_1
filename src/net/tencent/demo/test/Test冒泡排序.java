package net.tencent.demo.test;

import java.util.Arrays;

public class Test冒泡排序 {

	public static void main(String[] args) {
		// 冒泡排序
		
				/*
				 * 1.排序时：先找出最大的数
				 * 2.排序：可以升序，可以降序
				 * 
				 */
				int[] a={9,8,5,4,25,0};
				//比较5次：a.length-1次
				for(int i=1;i<a.length;i++)
				{
					if(a[i-1]>a[i])
					{
						int tmp=a[i-1];
						a[i-1]=a[i];
						a[i]=tmp;
					}
				}
				//找出第二大的数
				for(int i=1;i<a.length-1;i++)
				{
					if(a[i-1]>a[i])
					{
						int tmp=a[i-1];
						a[i-1]=a[i];
						a[i]=tmp;
					}
				}
				
				//找出第三大的数
						for(int i=1;i<a.length-2;i++)
						{
							if(a[i-1]>a[i])
							{
								int tmp=a[i-1];
								a[i-1]=a[i];
								a[i]=tmp;
							}
						}
				
				System.out.println(a[a.length-3]);
				System.out.println("====================");
				System.out.println(Arrays.toString(a));
				
				
				/*if(a[0]>a[1])
				{
					int tmp=a[0];
					a[0]=a[1];
					a[1]=tmp;
				}
				*/
	}
}
