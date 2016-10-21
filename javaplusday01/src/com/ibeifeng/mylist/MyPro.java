package com.ibeifeng.mylist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

public class MyPro {

	public static void main(String[] args) throws Exception {
		// 獲取jdbc配置文件
		// 方法一：
		/*
		 * //此處寫在java項目中的相對路徑 File file=new File("src/jdbc.properties");
		 * FileInputStream in = new FileInputStream(file);
		 */
		// 方法二：
		InputStream in = MyPro.class.getResourceAsStream("/jdbc.properties");
		// 檢測是否獲得輸入流,不爲null説明接收成功
		System.out.println(in);
		// ctrl+shift+/注釋；ctrl+shift+\取消注釋
		Properties properties = new Properties();
		// 解析屬性文件
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
