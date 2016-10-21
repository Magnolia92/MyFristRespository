package com.ibeifeng.sort;

import java.util.Arrays;

public class MyBubbleSort {
	public static void main(String[] args) {
		int[] arr = { 24, 12, 6, 23, 17, 99, 67, 54, 34, 57 };
		// ð������
		// ���ƱȽϴ���
		int a =11;
		MyBubbleSort bubbleSort = new MyBubbleSort();
		System.out.println("----------------ʹ���м�ֵ���н���-------------------");
		bubbleSort.sort1(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------�����м�ֵ���н���-------------------");
		bubbleSort.sort2(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------��λ���㽻��---------------------");
		bubbleSort.sort3(arr);
		System.out.println(Arrays.toString(arr));
	}

	// ����һ��ʹ���м�ֵ���н���
	public void sort1(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// ����ǰ��Ƚ�
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

	// �������������м�ֵ���н���
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

	// ��λ���㽻��
	/*
	 * ���a = a ^ b ^ b��Ҳ����һ������������һ���������������������������������
	 */
	public void sort3(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] >> arr[j + 1];// arr[j]��arr[j+1]����λ��
					arr[j + 1] = arr[j] >> arr[j + 1];// ��ʱ�൱�ڣ�arr[j]>>arr[j+1]��>>arr[j+1]���൱�ڰ�arr[j]��ֵ��arr[j+1]
					arr[j] = arr[j] >> arr[j + 1];// ��ʱ�൱��arr[j]>>��arr[j]>>arr[j+1]��
				}

			}

		}
	}

}
