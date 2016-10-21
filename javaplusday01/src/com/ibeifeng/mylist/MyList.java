package com.ibeifeng.mylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {

	public static void main(String[] args) {
		final int NUM = 100000;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// 测试add
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			arrayList.add(0, i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("ArrayList的add方法：：" + (end1 - start1));

		
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			linkedList.add(0, i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("LinkedList的add方法：：" + (end2 - start2));
		
		//測試查詢
		long start3 = System.currentTimeMillis();
		for (int i = 200; i < 10000; i++) {
			arrayList.get(i);
		}
		long end3 = System.currentTimeMillis();
		System.out.println("ArrayList的查詢方法：：" + (end3 - start3));
		
		long start4 = System.currentTimeMillis();
		for (int i = 200; i < 10000; i++) {
			linkedList.get(i);
		}
		long end4 = System.currentTimeMillis();
		System.out.println("LinkedList的查詢方法：：" + (end4 - start4));
		
		
	}
	
	
	
	
	
	
}
