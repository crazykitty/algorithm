package com.crazykitty.algorithm; 
/**
* 排序算法：1.基本排序
*             1.1交换排序
*               1.1.1冒泡排序
*               1.1.2快速排序  
*             1.2选择排序
*               1.2.1选择排序
*               1.2.2堆排序 
*             1.3插入排序      
*               1.3.1插入排序
*               1.3.2Shell排序
*             1.4合并排序
*           2.多路排序
*/


public class SortAlgorithm
{
    
	/**
	  *冒泡(Bubble Sort) 
	  *1.对数组中的数据依次比较相邻两个元素大小。
	  *2.如果前面的数据大于后面的数据就调换两者顺序。
	  *3.再用同样的方法将剩下的数据比较，最后结果小到大排序。
	*/       	
        public void bubbleSort(int[] a)
	{
		int temp;
		for(int i = 1; i < a.length; i++)
		{

			for(int j = 0; j < a.length - i; j++)
			{

				if(a[j] > a[j+1]) 
				{
	
					//调换相邻两个数据顺序
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;	
				}
			}

			//输出每步排序结果
			System.out.print("Step " + i + " : " );
			printArray(a);	
		}	
	}

	/**
	 *选择排序(Selection Sort)
	 *1.从N个数字中选择一个最小的替换第一个位置.
	 *2.从剩下的N-1个数字中选出一个最小的替换第二个位置.
	 *3.依此做完余下的数字.
	*/
	public void selectionSort(int[] a)
	{
		int minNumberIndex;
		int temp; 
		for(int i = 0; i < a.length - 1; i++)
		{
			minNumberIndex = i;
			//查找最小值
			int j;		
			for(int k = i + 1; k < a.length; k++)
			{
				if(a[k] < a[minNumberIndex])
				{	
				       minNumberIndex = k;
				}	
			} 	
			//将最小值和首位值替换	
			if(minNumberIndex != i)
			{
				temp = a[i];
				a[i] = a[minNumberIndex];
				a[minNumberIndex] = temp; 
			}

			//打印每次排序
			System.out.print("Step " + i + ": " );
			printArray(a);
		}		
	}
		
	/**
	 *插入排序（Insertion Sort）
	 *1.对前两个数据从小到大排序。
	 *2.将第三个数据与排排序好的前两个数据比较并插入合适位置。
	 *3.依次对剩下数据做相同的操作。
	*/	
	public void insertionSort(int[] a)
	{
		int i, j, t, h;
		for(i = 1; i < a.length; i++)
		{
			t = a[i];
			j = i-1;
			while(j >= 0 && t < a[j])
			{
				a[j + 1] = a[j];
				j--;
			}	
			a[j + 1] = t;
	
			System.out.print("Step " + i + ": ");
			printArray(a); 
		}
	}

	/**
	 *希尔排序(Shell Sort)
	 *1. 
	public void shellShort(int[] a)
	{

	}
	
	private void printArray(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " " );
		}
		System.out.println();	
	}
 
	
	 public static void main(String args[]) {
		System.out.println("Hello World!");	
	} 

}
