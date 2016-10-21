package com.ibeifeng.mystring;

import java.io.UnsupportedEncodingException;

public class MyString {

	public static void main(String[] args) throws Exception {
		MyString s = new MyString();
		// s.stringTest01();
		s.stringTest02();
	}

	// String����
	public void stringTest01() {
		String str1 = "hello";
		String str2 = "hello";// ���ٸ�����һ�У�ctrl+alt+���µļ�ͷ
		/*
		 * String str3=new String("hello");
		 * ����ȥ�������в�����û��hello���еĻ��Ͳ��ٳ������д������ڶ��з���һ���ڴ洴��һ��String����str3ָ����е��׵�ַ
		 * ==�Ƚ��ڴ��ַ ��û�л�����ʱ���ʴ����������󣬱�׼�ش�1����2��
		 */
		String str3 = new String("hello");
		String str4 = new String("hello");// shift+enterֱ�ӽ�����һ��
		System.out.println(str1 == str2);// true
		System.out.println(str1 == str3);// false
		System.out.println(str3 == str4);// false

	}

	// String���÷���
	public void stringTest02() throws UnsupportedEncodingException {
		String str = "Welcome to Beijing";

		// string��indexOf����
		int index = str.indexOf("e");
		System.out.println("36::string��indexOf����" + index);

		// string��lastIndexOf����
		int lastIndexOfStr = str.lastIndexOf("e");
		System.out.println("40::string��lastIndexOf����\n" + lastIndexOfStr);

		// string��subString����
		System.out.println("43::string��subString����\n" + str.substring(3));// �±��3��ʼ

		System.out.println("45::string��subString����\n" + str.substring(0, 3));

		// �Զ���ȫ��ctrl+1����shift+alt+L
		// tomcatĬ�ϱ�����iso-8859-1��getbytes���������������
		String string = new String(str.getBytes("iso-8859-1"), "utf-8");
		System.out.println("50����getbytes���������������\n" + string);
		// string��replace����,��һ���Ե�,��Ҫ��һ���ַ������ղ��������滻,��ӡ
		System.out.println("---------------string��replace����1----------------");
		System.out.println(str.replace("e", "f"));
		System.out.println("---------------string��replace����2----------------");
		System.out.println(str.replaceAll("to", "Too"));
		System.out.println("---------------string��replace�Ա�----------------");
		System.out.println("57::" + str);
		String str1 = str.replace("e", "f");
		System.out.println("59::" + str1);
		// string ��toCharArray����
		System.out.println("---------string ��toCharArray����-----------");
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.out.print(c + " ");

		}
		// string��split����
		System.out.println("\n-------------string��split����--------------");
		String[] splits = str.split("e");
		for (String s : splits) {
			System.out.println(s);
		}

		// string��concat����
		System.out.println("-----------string��concat����-----------------");
		System.out.println(str.concat("!!!"));
	}

}
