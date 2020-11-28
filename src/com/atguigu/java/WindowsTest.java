package com.atguigu.java;
/**
 *例子：创建三个窗口卖票，总票数为100张 
 * */
public class WindowsTest {
	public static void main(String[] args) {
		//创建三个线程类对象
		Windows w1= new Windows("窗口1");
		Windows w2= new Windows("窗口2");
		Windows w3= new Windows("窗口3");
		
		w1.start();
		w2.start();
		w3.start();
	}
}

//创建一个窗口类，继承Thread
class Windows extends Thread {
	//声明一个变量，用来存储票数，由于总共只有100张票需要static
	private static int piao = 100;
	
	//创建一个有参构造用来初始线程名
	public Windows(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		while (true) {
			if (piao > 0) {
				System.out.println(getName() + "卖票的票号为" + piao);
				piao--;
			}else {
				break;
			}
			
			
		}
	}
}
