package com.ibeifeng.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;



public class NewCopyFileByNio {
	public static void main(String[] args) throws Exception {
		//������������
		FileInputStream fis = new FileInputStream("D:/tools/FileZilla/FileZilla FTP Client/filezilla.exe");
		FileOutputStream fos = new FileOutputStream("e:/filezilla.exe");
		//��ȡ����дͨ��
		FileChannel fic = fis.getChannel();
		FileChannel foc = fos.getChannel();
		//���û�����
		ByteBuffer buffer =ByteBuffer.allocate(1024);
		//��д����
		while(fic.read(buffer)!=-1){
			buffer.flip();
			foc.write(buffer);
			buffer.clear();
		}
		fis.close();
		fos.close();
		fic.close();
		foc.close();
	}
}
