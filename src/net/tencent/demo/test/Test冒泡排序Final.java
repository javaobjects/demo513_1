package net.tencent.demo.test;

import java.util.Arrays;

public class Test冒泡排序Final {

	public static void main(String[] args) {
		// 冒泡排序
		
				/*
				 * 1.排序时：先找出最大的数
				 * 2.排序：可以升序，可以降序
				 * 3.<:表示降序    >：升序
				 */
				
				//比较5次：a.length-1次
				/*for(int i=1;i<a.length;i++)
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
				*/
				//找多少个数，for循环就循环多少次
				/* 找第一个最大数：比较5次  6-1
				 * 找第二个最大数：比较4次  6-2
				 * 。。。。
				 */
				int[] a={9,8,5,4,1,0};
				
				//找多少（长度-1）个数(注意：最后一个数不用找)，for循环就循环多少次
				for (int i = 1; i < a.length; i++) {
					/* 找第一个最大数：比较5次  6-1
					 * 找第二个最大数：比较4次  6-2
					 * 。。。。
					 */
					for(int index=1;index<=a.length-i;index++)//1  2  3  4  5
					{
						if(a[index-1]>a[index])//<:表示降序    >：升序
						{
							int tmp=a[index-1];
							a[index-1]=a[index];
							a[index]=tmp;
						}
					}
				}
				
				
				//System.out.println(a[a.length-3]);
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
