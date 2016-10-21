package com.ibeifeng.mylist;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MySer2 {

	public static void main(String[] args) throws Exception {
		//读取序列化文件，得到一个输入流，并且指定读取文件的地址
		FileInputStream fis = new FileInputStream("d:/test.bin");
		//得到一个对象流读取文件
		ObjectInputStream ois = new ObjectInputStream(fis);
		//读取对象
		User user =(User) ois.readObject();
		int i = ois.readInt();
		float f = ois.readFloat();
		boolean b = ois.readBoolean();
		//获取对象的内容并打印
		System.out.println(user.getName()+"\t"+user.getGender()+"\t"+user.getId());
		System.out.println(i+"\n"+f+"\n"+b);
		//关闭流
		ois.close();
	}
}
