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
			//同步锁，因为implements Runnable ，this指的是相同对象
			synchronized (this) {
				if(tickets>0){
					System.out.println(Thread.currentThread().getName()+"当前票号:"+tickets--);
				}else{
					return;
				}
			}
		}
	}

}
