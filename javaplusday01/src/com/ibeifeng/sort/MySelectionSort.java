package com.ibeifeng.sort;

import java.util.Arrays;

public class MySelectionSort {
	/*
	 * �x������ԭ��1 �Ȍ����M����С�Ĕ�ȡ����������߅�ϣ�
	 * 			2 ���ҳ����M�еڶ�С�Ĕ��֣����λ�ò������ŵ�����λ�ã��Դ���ơ�
	 */
	public static void main(String[] args) {
		int[] arr = { 24, 12, 6, 23, 17, 99, 67, 54, 34, 57 };
		/*
		 * ���Ʊ��^�Δ�,��һ�α��^len-1�Σ��@����Сֵ������arr[0]��λ����
		 * ��һ������֮��ÿһ�����M�б��^���@����Сֵ
		 * �ڶ��α��^�Δ�len-2.����arr[1]��λ����
		 * ���^�Δ���len-i-1
		 * ����min���������
		 */
		
		for(int i=0;i<arr.length-1;i++){
			//min����Сֵ������λ��
			int min=i;
			for (int j =i+1; j <arr.length ; j++) {
				//�����M���б���С�Ĕ�С�Ąt���������xֵ�omin
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
		 * ��֮���д������
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
