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

}


//创建一个Thread类的了类
class HelloThread extends Thread {
	
}
