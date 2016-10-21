package com.ibeifeng.mylist;

import java.util.Iterator;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		//綫程安全，使用方法參考arraylist
		Vector<Integer> vector = new Vector<Integer>();
		//添加數據
		vector.add(1);
		vector.add(11);
		vector.add(111);
		vector.add(1111);
		vector.add(11111);
		vector.add(111111);
		vector.add(1111111);
		//創建一個迭代器便利數據
		Iterator<Integer> it = vector.iterator();
		while(it.hasNext()){
		//	Integer next = it.next();
		//	System.out.println(next);
			System.out.println(it.next());
		}
	}
}
