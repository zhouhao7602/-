package com.atguigu.java;


/**
 * 多线程的创建，方式一：继承Thread类
 * 1.创建一个继承Thread类的子类
 * 2.重写Thread类的run()-->将此线程执行的操作声明在run()中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有偶数
 * */
public class ThreadTest {
	public static void main(String[] args) {
		//3.创建一个Thread类的子类对象
		MyThread my = new MyThread();
		//4.通过对象调用start()
		my.start();
		
		//一个线程对象只能一次start()
		MyThread my2 = new MyThread();
		my.start();
		
		for (int i = 0; i < 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i + "*************main()*****************");
			}
		}
	}
}


//1.创建一个继承Thread类的子类
class MyThread extends Thread {
	//2.重写Thread类的run()方法
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}