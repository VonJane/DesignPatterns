package com.jane.singleton;

/**
   * ���Զ���ʽ����ģʽ
 * @author 15142
 *
 */
public class SingletonDemo1 {

//	���ʼ��ʱ���������� ������󡣼�����ʱ��Ȼ�̰߳�ȫ��
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1() {
		
	}
	
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
