package com.atguigu.java;
/**
 * ��ʽThread�еĳ��÷���
* 1.start():������ǰ�߳�;���õ�ǰ�̵߳�run()
* 2.run()��ͨ����Ҫ��дThread���еĴ˷������������Ĵ���Ҫִ�еĲ��������ڴ˷�����
* 3.currentThread()����̬����������ִ�е�ǰ����Ĵ���
* 4.getName():��ȡ��ǰ�̵߳�����
* 5.setName():���õ�ǰ�̵߳�����
* 6.yield()���ͷŵ�ǰcpu��ִ��Ȩ
* 7.join()�����߳�a�е����߳�b��join()����ʱ�߳�a�ͽ�������״̬��ֱ���߳�b��ȫִ�����Ժ��߳�a�Ž�������״̬
* 8.stop()���ѹ�ʱ����ִ�д˷���ʱ��ǿ�ƽ�����ǰ���֡�
* 9.sleep(Long millitime):�õ�ǰ�̡߳�˯�ߡ�ָ����millitime���롣��ָ����millitime����ʱ���ڣ���ǰ�߳�����״̬
* 10.isAlive()���жϵ�ǰ�߳��Ƿ���
 * */
public class ThreadMethodTest {
	public static void main(String[] args) {
		//����һ���̶߳���
		HelloThread my1 = new HelloThread();
		
		//�����߳������߳���
		my1.setName("���߳�");
		//�����߳������߳������������߳�main()����û�м̳�Thread�࣬Ҫ�Ȼ�ȡ�߳�
		Thread.currentThread().setName("���߳�main()");
		
		//�����߳�
		my1.start();
		
		
		//���߳�main()�Ĵ��룬
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				//�����߳�3��ʱ��ÿ���һ��ִ��һ�Ρ������е�1000�Ǻ���
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


//����һ��Thread�������
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
			
			//�����߳�i=20��ʱ����ͷ�ִ��Ȩ����������һ���ɱ���߳����У����ͷ�ִ��Ȩ֮��ǰ�߳�Ҳ�п����ٴ�����
			if (i == 20) {
				this.yield();
			}
			//�����߳�2��ʱ������ŵȴ�,�ɱ���߳�ִ����֮����ִ��
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
