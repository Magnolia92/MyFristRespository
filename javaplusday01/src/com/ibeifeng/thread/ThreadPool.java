package com.ibeifeng.thread;


import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;



public class ThreadPool {

	public static void main(String[] args) {
		//创建一个可缓存的线程池
//		ExecutorService cpt=Executors.newCachedThreadPool();
//		for (int i = 0; i <10; i++) {
//			MyThread thread=new MyThread();
//			cpt.execute(thread);
//		}
//		cpt.shutdown();
		
	//	System.out.println("-------------------");
		//存放一个定长的线程池
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
			 * 参数1：要执行的线程
			 * 参数2：延时多久执行
			 * 参数3：执行周期
			 * 参数4：时间的单位
			 */
			stpe.scheduleAtFixedRate(thread, 1000, 2000, TimeUnit.MILLISECONDS);
		}
		//此处不要shutdown
}
}
class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("当前线程名："+Thread.currentThread().getName());
	}
}