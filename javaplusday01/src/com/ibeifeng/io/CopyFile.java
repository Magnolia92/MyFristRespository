package com.ibeifeng.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		//创建一个文件输入流
		FileInputStream fis = new FileInputStream("d:/case01.sh");
		FileOutputStream fos = new FileOutputStream("src/case01.sh");
		//创建一个数组
		byte[] byts=new byte[1024];
		int len=-1;
		//当还有byts时写入流
		while((len = fis.read(byts))!=-1){
			fos.write(byts, 0, len);		}
		//一般写完操作都要刷新流
		fos.flush();
		fis.close();
		fos.close();
	}

}
