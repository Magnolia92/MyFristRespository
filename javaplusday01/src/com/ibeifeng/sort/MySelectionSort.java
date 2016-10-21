package com.ibeifeng.sort;

import java.util.Arrays;

public class MySelectionSort {
	/*
	 * 選擇排序原理：1 先將數組中最小的數取出，放在最邊上，
	 * 			2 在找出數組中第二小的數字，如果位置不對，放到相應位置，以此類推。
	 */
	public static void main(String[] args) {
		int[] arr = { 24, 12, 6, 23, 17, 99, 67, 54, 34, 57 };
		/*
		 * 控制比較次數,第一次比較len-1次，獲得最小值，放在arr[0]的位置上
		 * 第一個數和之後每一個數進行比較，獲得最小值
		 * 第二次比較次數len-2.放在arr[1]的位置上
		 * 比較次數爲len-i-1
		 * 加入min更有助理解
		 */
		
		for(int i=0;i<arr.length-1;i++){
			//min爲最小值所在下標位置
			int min=i;
			for (int j =i+1; j <arr.length ; j++) {
				//當數組中有比最小的數小的則將它的下標賦值給min
				if(arr[j]<arr[min]){
					min=j;
				}
				if (i!=min){
					int tmp=arr[i];
					arr[i]=arr[min];
					arr[min]=tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		/*
		 * 简化之后可写成如下
		 *
		 * for(int i=0;i<arr.length-1;i++){
			for (int j =i+1; j <arr.length ; j++) {
				if(arr[j]<arr[i]){
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		 */
		
		
	}
}
