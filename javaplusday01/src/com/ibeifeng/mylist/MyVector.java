package com.ibeifeng.mylist;

import java.util.Iterator;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		//�Q�̰�ȫ��ʹ�÷�������arraylist
		Vector<Integer> vector = new Vector<Integer>();
		//��Ӕ���
		vector.add(1);
		vector.add(11);
		vector.add(111);
		vector.add(1111);
		vector.add(11111);
		vector.add(111111);
		vector.add(1111111);
		//����һ����������������
		Iterator<Integer> it = vector.iterator();
		while(it.hasNext()){
		//	Integer next = it.next();
		//	System.out.println(next);
			System.out.println(it.next());
		}
	}
}
