package com.jane.singleton;

/**
   * 静态内部类实现单例模式
   * 这种方式线程安全，调用效率高并且实现了延时加载
 * @author 15142
 *
 */
public class SingletonDemo3 {

	private static class SingletonClassInstance {
		private static final SingletonDemo3 instance = new SingletonDemo3();
	}
	
	private SingletonDemo3() {
		
	}
	
//	方法同步，调用效率低。
	public static SingletonDemo3 getInstance() {
		return SingletonClassInstance.instance;
	}
}
