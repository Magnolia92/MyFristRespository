package com.ibeifeng.mylist;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySer {

	public static void main(String[] args) throws Exception {
		//�õ�һ���ļ������������ָ�����λ��
		FileOutputStream fos = new FileOutputStream("d:/test.bin");
		//����һ�����������
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//д��һ������
		oos.writeObject(new User("����","��",18));
		oos.writeInt(2);
		oos.writeFloat(27.19f);
		oos.writeBoolean(true);
		//ˢ�²��ر���
		oos.flush();
		oos.close();
	}
}
