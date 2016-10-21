package com.ibeifeng.mystring;

import java.util.ArrayList;
import java.util.Arrays;

public class MyString03 {

	public static void main(String[] args) {
		final int NUM = 10000;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < NUM; i++) {
			if (i == NUM - 1) {
				sb.append(i);
			} else {
				sb.append(i + ",");
			}
		}

		// ��stringbufferת��Ϊstring
		String str = sb.toString();
//		long start1 = System.currentTimeMillis();
//		str.split(",");
//		long end1 = System.currentTimeMillis();
//		System.out.println("�Դ�API�����ָ��ַ���ʱ�䣺" + (end1 - start1));
//
//		long start2 = System.currentTimeMillis();
//		// ���ַ��������и��Ϊ����
//		getStrArr(str);
//		long end2 = System.currentTimeMillis();
//		System.out.println("�Զ��巽���ָ��ַ���ʱ�䣺" + (end2 - start2));
		// ��ӡ����
		String[] strArr=getStrArr(str);
		 System.out.println(Arrays.toString(strArr));

	}

	// ���ַ��������������ʽ���ַ����м䡰�����������ʷָ��ַ������ҡ�����λ��
	public static String[] getStrArr(String str) {
		// ����һ��ArrayList����
		ArrayList<String> arrList = new ArrayList<String>();
		int len = -1;
		// ��str�ַ������Ҳ���������ʱ����-1�������ڷ���ֵ����-1ʱ�����и�
		while ((len = str.indexOf(",")) != -1) {
			// ÿ�ζ�����ã�0,1��֮����ַ����������ڼ�����
			//System.out.println(len);
			//System.out.println("46::"+str.substring(0, len));
			arrList.add(str.substring(0, len));// alt+���¼�ͷ���ƶ�λ��
			// �ָ�
		//	System.out.println(str);ע�⣬Ҳ��һλ
			str = str.substring(len + 1);
			//System.out.println(str);
		}
		arrList.add(str);
		return arrList.toArray(new String[arrList.size()]);
	}
}
