package com.ibeifeng.mylist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

public class MyPro {

	public static void main(String[] args) throws Exception {
		// �@ȡjdbc�����ļ�
		// ����һ��
		/*
		 * //��̎����java�Ŀ�е�����·�� File file=new File("src/jdbc.properties");
		 * FileInputStream in = new FileInputStream(file);
		 */
		// ��������
		InputStream in = MyPro.class.getResourceAsStream("/jdbc.properties");
		// �z�y�Ƿ�@��ݔ����,����null�h�����ճɹ�
		System.out.println(in);
		// ctrl+shift+/עጣ�ctrl+shift+\ȡ��ע�
		Properties properties = new Properties();
		// ���������ļ�
		properties.load(in);
		String driverClass = properties.getProperty("driverClass");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.out.println(driverClass + "\n" + url + "\n" + username + "\n"
				+ password);
		properties.setProperty("name", "zhangsan");
		FileOutputStream out = new FileOutputStream(new File(
				"src/jdbc.properties"));
		properties.store(out, "this is a comment!");
		System.out.println("OK~~");
	}
}
