package com.ibeifeng.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		//����һ���ļ�������
		FileInputStream fis = new FileInputStream("d:/case01.sh");
		FileOutputStream fos = new FileOutputStream("src/case01.sh");
		//����һ������
		byte[] byts=new byte[1024];
		int len=-1;
		//������bytsʱд����
		while((len = fis.read(byts))!=-1){
			fos.write(byts, 0, len);		}
		//һ��д�������Ҫˢ����
		fos.flush();
		fis.close();
		fos.close();
	}

}
