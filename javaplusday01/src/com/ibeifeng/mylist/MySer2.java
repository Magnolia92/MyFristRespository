package com.ibeifeng.mylist;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MySer2 {

	public static void main(String[] args) throws Exception {
		//��ȡ���л��ļ����õ�һ��������������ָ����ȡ�ļ��ĵ�ַ
		FileInputStream fis = new FileInputStream("d:/test.bin");
		//�õ�һ����������ȡ�ļ�
		ObjectInputStream ois = new ObjectInputStream(fis);
		//��ȡ����
		User user =(User) ois.readObject();
		int i = ois.readInt();
		float f = ois.readFloat();
		boolean b = ois.readBoolean();
		//��ȡ��������ݲ���ӡ
		System.out.println(user.getName()+"\t"+user.getGender()+"\t"+user.getId());
		System.out.println(i+"\n"+f+"\n"+b);
		//�ر���
		ois.close();
	}
}
