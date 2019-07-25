package com.jane.singleton;

/**
   * 测试饿汉式单例模式
 * @author 15142
 *
 */
public class SingletonDemo1 {

//	类初始化时，立即加载 这个对象。加载类时天然线程安全。
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1() {
		
	}
	
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
