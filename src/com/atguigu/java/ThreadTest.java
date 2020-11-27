package com.atguigu.java;


/**
 * ���̵߳Ĵ�������ʽһ���̳�Thread��
 * 1.����һ���̳�Thread�������
 * 2.��дThread���run()-->�����߳�ִ�еĲ���������run()��
 * 3.����Thread�������Ķ���
 * 4.ͨ���˶������start()
 * <p>
 * ���ӣ�����100���ڵ�����ż��
 * */
public class ThreadTest {
	public static void main(String[] args) {
		//3.����һ��Thread����������
		MyThread my = new MyThread();
		//4.ͨ���������start()
		my.start();
		
		//һ���̶߳���ֻ��һ��start()
		MyThread my2 = new MyThread();
		my.start();
		
		for (int i = 0; i < 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i + "*************main()*****************");
			}
		}
	}
}


//1.����һ���̳�Thread�������
class MyThread extends Thread {
	//2.��дThread���run()����
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}