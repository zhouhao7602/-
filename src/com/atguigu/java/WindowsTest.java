package com.atguigu.java;
/**
 *���ӣ���������������Ʊ����Ʊ��Ϊ100�� 
 * */
public class WindowsTest {
	public static void main(String[] args) {
		//���������߳������
		Windows w1= new Windows("����1");
		Windows w2= new Windows("����2");
		Windows w3= new Windows("����3");
		
		w1.start();
		w2.start();
		w3.start();
	}
}

//����һ�������࣬�̳�Thread
class Windows extends Thread {
	//����һ�������������洢Ʊ���������ܹ�ֻ��100��Ʊ��Ҫstatic
	private static int piao = 100;
	
	//����һ���вι���������ʼ�߳���
	public Windows(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		while (true) {
			if (piao > 0) {
				System.out.println(getName() + "��Ʊ��Ʊ��Ϊ" + piao);
				piao--;
			}else {
				break;
			}
			
			
		}
	}
}
