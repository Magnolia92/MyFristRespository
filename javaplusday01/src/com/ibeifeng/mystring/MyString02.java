package com.ibeifeng.mystring;

public class MyString02 {
	
	public static void main(String[] args) {
		MyString02  s=new MyString02 ();
		s.stringTest01();
	}

	/*
	 * StringBuffer�̰߳�ȫ
	 */
	public void stringTest01(){
		String str="hello";
		final int NUM=10000;
		long start1 = System.currentTimeMillis()*1000;
		for(int i=0;i<NUM;i++){
			str=str+i;
		}
		long end1 = System.currentTimeMillis()*1000;
		System.out.println("ʹ��String+ƴ���ַ���ʱ�䣺"+(end1-start1));
		
		StringBuilder sb=new StringBuilder("hello");
		long start2 = System.currentTimeMillis()*1000;
		for(int i=0;i<NUM;i++){
			sb.append(i);
		}
		long end2 = System.currentTimeMillis()*1000;
		System.out.println("ʹ��StringBuliderƴ���ַ���ʱ�䣺"+(end2-start2));
		
		
		StringBuffer sbf=new StringBuffer("hello");
		long start3 = System.currentTimeMillis()*1000;
		for(int i=0;i<NUM;i++){
			sbf.append(i);
		}
		long end3 = System.currentTimeMillis()*1000;
		System.out.println("ʹ��StringBufferƴ���ַ���ʱ�䣺"+(end3-start3));	
	}

	
}
