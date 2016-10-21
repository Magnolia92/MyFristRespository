package com.ibeifeng.mylist;

import java.util.Stack;

public class MyStack {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//添加數據，壓棧
		stack.push("商品1");
		stack.push("商品2");
		stack.push("商品3");
		stack.push("商品4");
		stack.push("商品5");
		stack.push("商品6");
		//int len=stack.size();放在此處會發生Exception in thread "main" java.util.EmptyStackException
		//取出第一个值，彈棧,再去取棧中值時zhangsan5就不在棧中了
		System.out.println(stack.pop());
		//遍歷獲取棧中值，需要先用變量接收棧的大小，彈棧一次釋放一次空間
		
		System.out.println("---------------------");
		/*
		 * 可以用該方法來查看最近的查看的物品的記錄
		 */
		int len=stack.size();
		System.out.println("最近查看的商品爲：");
		for (int i = 0; i <len; i++) {
		System.out.println(stack.pop());
			
		}
		
	}
}
