package com.training.java.core.threads;

public class ThreadDemo implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Entered main thread");
		
		ThreadDemo td = new ThreadDemo();
		td.startAndRunChildThread();
		
		for(int i=0; i<1000; i++)
		{
			System.out.println("In main thread, i = " + i);
		}
	}
	
	public void startAndRunChildThread()
	{
		//Create and spawn new thread
		new Thread(this).start();
	}

	@Override
	public void run() {
		for(int j=0; j<1000; j++)
		{
			System.out.println("Child thread..j = " + j);
		}
	}

}
