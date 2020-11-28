package com.atguigu.java;
/**
 * 测式Thread中的常用方法
* 1.start():启动当前线程;调用当前线程的run()
* 2.run()：通常需要重写Thread类中的此方法，将创建的纯种要执行的操作声明在此方法中
* 3.currentThread()：静态方法，返回执行当前代码的纯种
* 4.getName():获取当前线程的名字
* 5.setName():设置当前线程的名字
* 6.yield()：释放当前cpu的执行权
* 7.join()：在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才结束阻塞状态
* 8.stop()：已过时。当执行此方法时，强制结束当前纯种。
* 9.sleep(Long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前线程阻塞状态
* 10.isAlive()：判断当前线程是否存活
 * */
public class ThreadMethodTest {
	public static void main(String[] args) {
		//创建一个线程对象
		HelloThread my1 = new HelloThread();
		
		//给子线程设置线程名
		my1.setName("子线程");
		//给主线程设置线程名，由于主线程main()的类没有继承Thread类，要先获取线程
		Thread.currentThread().setName("主线程main()");
		
		//运行线程
		my1.start();
		
		
		//主线程main()的代码，
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				//当主线程3的时候，每间隔一秒执行一次。方法中的1000是毫秒
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
			
		}
	}
	

}


//创建一个Thread类的了类
class HelloThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName() + ":" + i);
			}
			
			//当子线程i=20的时候就释放执行权，理论上下一次由别的线程运行，但释放执行权之后当前线程也有可能再次抢到
			if (i == 20) {
				this.yield();
			}
			//当子线程2的时候进入门等待,由别的线程执行完之后再执行
			if (i == 2) {
				try {
					join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
