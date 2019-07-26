package com.jane.singleton;

import java.io.Serializable;

/**
   * ���Զ���ʽ����ģʽ����η�ֹ����ͷ����л��ƽ⣩
   * ���ַ�ʽ�̰߳�ȫ������Ч�ʸ߲���ʵ������ʱ����
 * @author 15142
 *
 */
public class SingletonDemo5 implements Serializable{

	private static class SingletonClassInstance {
		private static final SingletonDemo5 instance = new SingletonDemo5();
	}
	
	private SingletonDemo5() {
		if (SingletonClassInstance.instance != null) {
			throw new RuntimeException();
		}
	}
	
//	����ͬ��������Ч�ʵ͡�
	public static SingletonDemo5 getInstance() {
		return SingletonClassInstance.instance;
	}
}
