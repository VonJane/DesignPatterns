package com.jane.singleton;

import java.io.Serializable;

/**
   * 测试饿汉式单例模式（如何防止反射和反序列化破解）
   * 这种方式线程安全，调用效率高并且实现了延时加载
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
	
//	方法同步，调用效率低。
	public static SingletonDemo5 getInstance() {
		return SingletonClassInstance.instance;
	}
}
