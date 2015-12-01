package com.myThread.threading;

public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  priority = "+Thread.currentThread().getPriority());

	}

}
