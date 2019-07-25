package com.jane.singleton;

/**
   * 测试懒汉式单例模式
 * @author 15142
 *
 */
public class SingletonDemo2 {

//	类初始化时，立即加载 这个对象。
	private static SingletonDemo2 instance;
	
	private SingletonDemo2() {
		
	}
	
//	方法同步，调用效率低。
	public static synchronized SingletonDemo2 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
