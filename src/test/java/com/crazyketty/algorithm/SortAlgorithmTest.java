package com.crazykitty.algorithm;

import org.junit.Test;
import org.junit.Before;
import com.crazykitty.algorithm.*;
import java.util.*;

public class SortAlgorithmTest{
	
	private SortAlgorithm sa = new SortAlgorithm();	
	private static final int SIZE = 10;	

	@Test
        public void testBubbleSort(){
		System.out.println("#######Bubble Sort######START###");	
		int[] a = createArray();
		System.out.print("Before sort : \n");
		printArray(a);		
		sa.bubbleSort(a);
		System.out.print("After sort : \n"); 
		printArray(a);	
		System.out.println("#######Bubble Sort######END###");
	}

	@Test
        public void testSelectionSort(){
		System.out.println("####Selection Sort######START###");	
		int[] a = createArray();
		System.out.print("Before sort : \n");
		printArray(a);		
		sa.selectionSort(a);
		System.out.print("After sort : \n"); 
		printArray(a);	
		System.out.println("#######Selection Sort######END###");
	}

	@Test
        public void testInsertionSort(){
		System.out.println("####Insertion Sort######START###");	
		int[] a = createArray();
		System.out.print("Before sort : \n");
		printArray(a);		
		sa.insertionSort(a);
		System.out.print("After sort : \n"); 
		printArray(a);	
		System.out.println("#######Insertion Sort######END###");
	}

	private int[] createArray()
	{
		int[] a = new int[SIZE];
		for (int i = 0; i < SIZE; i++)
		{

			a[i] = (int) ( 100 + Math.random() * (100 + 1));
		}
		return a;		
	} 
		
	private void printArray(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " " );
		}
		System.out.println();	
	}
} 
