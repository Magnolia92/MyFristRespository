package com.ibeifeng.mylist;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySer {

	public static void main(String[] args) throws Exception {
		//得到一个文件输出流，并且指定输出位置
		FileOutputStream fos = new FileOutputStream("d:/test.bin");
		//创建一个对象输出流
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//写入一个对象
		oos.writeObject(new User("张三","男",18));
		oos.writeInt(2);
		oos.writeFloat(27.19f);
		oos.writeBoolean(true);
		//刷新并关闭流
		oos.flush();
		oos.close();
	}
}
