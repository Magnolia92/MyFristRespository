package com.ibeifeng.thread;

public class BuyTickets2 extends Thread{
	int tickets=100;
	public static void main(String[] args) {
		BuyTickets2 b1=new BuyTickets2();
		BuyTickets2 b2=new BuyTickets2();
		BuyTickets2 b3=new BuyTickets2();
		b1.start();
		b2.start();
		b3.start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(tickets>0){
			synchronized (BuyTickets2.class) {
				if(tickets>0){
					System.out.println(Thread.currentThread().getName()+"µ±Ç°Æ±ºÅ"+tickets--);
				}
			}
		}
	}
}
