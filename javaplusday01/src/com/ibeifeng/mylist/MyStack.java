package com.ibeifeng.mylist;

import java.util.Stack;

public class MyStack {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//��Ӕ���������
		stack.push("��Ʒ1");
		stack.push("��Ʒ2");
		stack.push("��Ʒ3");
		stack.push("��Ʒ4");
		stack.push("��Ʒ5");
		stack.push("��Ʒ6");
		//int len=stack.size();���ڴ�̎���l��Exception in thread "main" java.util.EmptyStackException
		//ȡ����һ��ֵ������,��ȥȡ����ֵ�rzhangsan5�Ͳ��ڗ�����
		System.out.println(stack.pop());
		//��v�@ȡ����ֵ����Ҫ����׃�����՗��Ĵ�С������һ��ጷ�һ�ο��g
		
		System.out.println("---------------------");
		/*
		 * ������ԓ������鿴����Ĳ鿴����Ʒ��ӛ�
		 */
		int len=stack.size();
		System.out.println("����鿴����Ʒ����");
		for (int i = 0; i <len; i++) {
		System.out.println(stack.pop());
			
		}
		
	}
}
