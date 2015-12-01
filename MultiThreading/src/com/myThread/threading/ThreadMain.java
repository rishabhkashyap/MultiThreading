package com.myThread.threading;

public class ThreadMain {
	public static void main(String[] args){
		
		ThreadPriority tp=new ThreadPriority();
		Thread aplha =new Thread(tp);
		Thread beta =new Thread(tp);
		Thread gamma =new Thread(tp);
		
		aplha.setPriority(Thread.NORM_PRIORITY);
		beta.setPriority(Thread.MIN_PRIORITY);
		gamma.setPriority(Thread.MAX_PRIORITY);
		aplha.setName("Alpha");
		beta.setName("Beta");
		gamma.setName("Gamma");
		aplha.start();
		beta.start();
		gamma.start();
		
	}

}
