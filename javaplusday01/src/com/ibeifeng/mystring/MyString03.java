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

		// 将stringbuffer转化为string
		String str = sb.toString();
//		long start1 = System.currentTimeMillis();
//		str.split(",");
//		long end1 = System.currentTimeMillis();
//		System.out.println("自带API方法分割字符串时间：" + (end1 - start1));
//
//		long start2 = System.currentTimeMillis();
//		// 对字符串进行切割，变为数组
//		getStrArr(str);
//		long end2 = System.currentTimeMillis();
//		System.out.println("自定义方法分割字符串时间：" + (end2 - start2));
		// 打印数组
		String[] strArr=getStrArr(str);
		 System.out.println(Arrays.toString(strArr));

	}

	// 将字符串保存成数组形式，字符串中间“，”隔开，故分割字符串先找“，”位置
	public static String[] getStrArr(String str) {
		// 创建一个ArrayList对象
		ArrayList<String> arrList = new ArrayList<String>();
		int len = -1;
		// 当str字符串查找不到“，”时返回-1，所以在返回值不是-1时进行切割
		while ((len = str.indexOf(",")) != -1) {
			// 每次都将获得（0,1）之间的字符串并保存在集合中
			//System.out.println(len);
			//System.out.println("46::"+str.substring(0, len));
			arrList.add(str.substring(0, len));// alt+上下箭头来移动位置
			// 分割
		//	System.out.println(str);注意，也是一位
			str = str.substring(len + 1);
			//System.out.println(str);
		}
		arrList.add(str);
		return arrList.toArray(new String[arrList.size()]);
	}
}
