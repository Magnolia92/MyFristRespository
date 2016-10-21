package com.ibeifeng.sort;

import java.util.Arrays;

public class MyBubbleSort {
	public static void main(String[] args) {
		int[] arr = { 24, 12, 6, 23, 17, 99, 67, 54, 34, 57 };
		// 冒泡排序法
		// 控制比较次数
		int a =11;
		MyBubbleSort bubbleSort = new MyBubbleSort();
		System.out.println("----------------使用中间值进行交换-------------------");
		bubbleSort.sort1(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------不用中间值进行交换-------------------");
		bubbleSort.sort2(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------移位运算交换---------------------");
		bubbleSort.sort3(arr);
		System.out.println(Arrays.toString(arr));
	}

	// 方法一：使用中间值进行交换
	public void sort1(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// 控制前后比较
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = 0;
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	// 方法二：不用中间值进行交换
	public void sort2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}
	}

	// 移位运算交换
	/*
	 * 理解a = a ^ b ^ b，也就是一个数连续与另一个数进行两次与运算结果还是这个数本身
	 */
	public void sort3(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] >> arr[j + 1];// arr[j]和arr[j+1]交换位置
					arr[j + 1] = arr[j] >> arr[j + 1];// 此时相当于（arr[j]>>arr[j+1]）>>arr[j+1]，相当于把arr[j]赋值给arr[j+1]
					arr[j] = arr[j] >> arr[j + 1];// 此时相当于arr[j]>>（arr[j]>>arr[j+1]）
				}

			}

		}
	}

}
