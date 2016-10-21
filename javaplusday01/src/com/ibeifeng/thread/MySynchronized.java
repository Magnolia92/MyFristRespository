package com.ibeifeng.thread;

public class MySynchronized implements Runnable{
	int start=0;
	public static void main(String[] args) {
		MySynchronized s=new MySynchronized();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		t1.setName("�߳�A");
		t2.setName("�߳�B");
		t1.start();
		t2.start();
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(start <1000){
			synchronized (this) {
				//�ȴ������߳�
				notify();
				if (start++ %2==0){
					System.out.println(Thread.currentThread().getName()+":1");
				}else{
					System.out.println(Thread.currentThread().getName()+":2");
				}
				
				try {
					//��ӡ��ȴ�
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
