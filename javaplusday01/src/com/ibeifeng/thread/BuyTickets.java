package com.ibeifeng.thread;

public class BuyTickets implements Runnable{
	int tickets=100;
	public static void main(String[] args) {
		 BuyTickets r=new  BuyTickets();
		 Thread t1=new Thread(r);
		 Thread t2=new Thread(r);
		 Thread t3=new Thread(r);
		 t1.start();
		 t2.start();
		 t3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(tickets>0){
			//ͬ��������Ϊimplements Runnable ��thisָ������ͬ����
			synchronized (this) {
				if(tickets>0){
					System.out.println(Thread.currentThread().getName()+"��ǰƱ��:"+tickets--);
				}else{
					return;
				}
			}
		}
	}

}
