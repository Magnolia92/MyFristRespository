package com.ibeifeng.thread;


import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;



public class ThreadPool {

	public static void main(String[] args) {
		//����һ���ɻ�����̳߳�
//		ExecutorService cpt=Executors.newCachedThreadPool();
//		for (int i = 0; i <10; i++) {
//			MyThread thread=new MyThread();
//			cpt.execute(thread);
//		}
//		cpt.shutdown();
		
	//	System.out.println("-------------------");
		//���һ���������̳߳�
//		ExecutorService fpt=Executors.newFixedThreadPool(10);
//		for(int j=0;j<50;j++){
//			MyThread thread=new MyThread();
//			fpt.execute(thread);
//	}
//		fpt.shutdown();
		
/*		ExecutorService stp=Executors.newSingleThreadExecutor();
		for(int j=0;j<50;j++){
			MyThread thread=new MyThread();
			stp.execute(thread);
		}
		stp.shutdown();*/
		
		ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(10);
		for(int j=0;j<50;j++){
			MyThread thread=new MyThread();
			/*
			 * ����1��Ҫִ�е��߳�
			 * ����2����ʱ���ִ��
			 * ����3��ִ������
			 * ����4��ʱ��ĵ�λ
			 */
			stpe.scheduleAtFixedRate(thread, 1000, 2000, TimeUnit.MILLISECONDS);
		}
		//�˴���Ҫshutdown
}
}
class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName());
	}
}