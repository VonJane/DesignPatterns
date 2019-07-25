package com.jane.singleton;

/**
   * ��������ʽ����ģʽ
 * @author 15142
 *
 */
public class SingletonDemo2 {

//	���ʼ��ʱ���������� �������
	private static SingletonDemo2 instance;
	
	private SingletonDemo2() {
		
	}
	
//	����ͬ��������Ч�ʵ͡�
	public static synchronized SingletonDemo2 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
