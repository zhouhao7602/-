package com.atguigu.exer;
/**
 * ��ϰ�������������̣߳�����һ���̱߳���100���ڵ�ż������һ���̱߳���100���ڵ�����
 * */
public class ThreadDome {
	public static void main(String[] args) {
//		MyThread1 my1 = new MyThread1();
//		MyThread2 my2 = new MyThread2();
//		
//		my1.start();
//		my2.start();
//ͨ��������ʵ��������ͬ�̵߳ķ�������
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


//����1������һ���߳�����
class MyThread1 extends Thread {
	//��д��run()����������100���ڵ�ż��
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + "--" + i);
			}
		}
	}
}

//����1��������һ���̵߳�����
class MyThread2 extends Thread {
	//��дrun()����������100���ڵ�����
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + "--" + i);
			}
		}
	}
}