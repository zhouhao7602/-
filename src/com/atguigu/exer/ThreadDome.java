package com.atguigu.exer;
/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 * */
public class ThreadDome {
	public static void main(String[] args) {
//		MyThread1 my1 = new MyThread1();
//		MyThread2 my2 = new MyThread2();
//		
//		my1.start();
//		my2.start();
//通过匿名类实现两个不同线程的方法主体
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					if (i % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + "--" + i);
					}
				}
			};
		}.start();
		
		
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					if (i % 2 != 0) {
						System.out.println(Thread.currentThread().getName() + "--" + i);
					}
				}
			};
		}.start();
	}
}


//方法1，创建一个线程子类
class MyThread1 extends Thread {
	//重写扪run()方法，遍历100以内的偶数
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + "--" + i);
			}
		}
	}
}

//方法1：创建另一个线程的子类
class MyThread2 extends Thread {
	//重写run()方法，遍历100以内的奇数
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + "--" + i);
			}
		}
	}
}