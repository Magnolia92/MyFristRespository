package com.ibeifeng.mystring;

import java.io.UnsupportedEncodingException;

public class MyString {

	public static void main(String[] args) throws Exception {
		MyString s = new MyString();
		// s.stringTest01();
		s.stringTest02();
	}

	// String对象
	public void stringTest01() {
		String str1 = "hello";
		String str2 = "hello";// 快速复制上一行：ctrl+alt+向下的箭头
		/*
		 * String str3=new String("hello");
		 * 会先去常量池中查找有没有hello，有的话就不再常量池中创建，在堆中分配一个内存创建一个String对象，str3指向堆中的首地址
		 * ==比较内存地址 当没有环境的时候问创建几个对象，标准回答1个或2个
		 */
		String str3 = new String("hello");
		String str4 = new String("hello");// shift+enter直接进入下一行
		System.out.println(str1 == str2);// true
		System.out.println(str1 == str3);// false
		System.out.println(str3 == str4);// false

	}

	// String常用方法
	public void stringTest02() throws UnsupportedEncodingException {
		String str = "Welcome to Beijing";

		// string的indexOf方法
		int index = str.indexOf("e");
		System.out.println("36::string的indexOf方法" + index);

		// string的lastIndexOf方法
		int lastIndexOfStr = str.lastIndexOf("e");
		System.out.println("40::string的lastIndexOf方法\n" + lastIndexOfStr);

		// string的subString方法
		System.out.println("43::string的subString方法\n" + str.substring(3));// 下标从3开始

		System.out.println("45::string的subString方法\n" + str.substring(0, 3));

		// 自动补全：ctrl+1或者shift+alt+L
		// tomcat默认编码是iso-8859-1，getbytes方法解决乱码问题
		String string = new String(str.getBytes("iso-8859-1"), "utf-8");
		System.out.println("50：：getbytes方法解决乱码问题\n" + string);
		// string的replace方法,是一次性的,需要用一个字符串接收才是永久替换,打印
		System.out.println("---------------string的replace方法1----------------");
		System.out.println(str.replace("e", "f"));
		System.out.println("---------------string的replace方法2----------------");
		System.out.println(str.replaceAll("to", "Too"));
		System.out.println("---------------string的replace对比----------------");
		System.out.println("57::" + str);
		String str1 = str.replace("e", "f");
		System.out.println("59::" + str1);
		// string 的toCharArray方法
		System.out.println("---------string 的toCharArray方法-----------");
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.out.print(c + " ");

		}
		// string的split方法
		System.out.println("\n-------------string的split方法--------------");
		String[] splits = str.split("e");
		for (String s : splits) {
			System.out.println(s);
		}

		// string的concat方法
		System.out.println("-----------string的concat方法-----------------");
		System.out.println(str.concat("!!!"));
	}

}
