package com.java.Threads;

public class FirstThread extends Thread {

	public static void main(String[] args) throws Exception {

		FirstThread t = new FirstThread();
		t.start();
		System.out.println("id " + t.getId());
		System.out.println("name " + t.getName());
		System.out.println("priority " + t.getPriority());
		System.out.println("daemon "+t.isDaemon());
	}

	public void run() {
		System.out.println("thread is running");
	}

}
