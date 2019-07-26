package com.jane.singleton;

/**
   * 测试枚举类实现单例模式
   * 没有延时加载
 * @author 15142
 *
 */
public enum SingletonDemo4 {

//	这个枚举元素，本身就是单例对象
	INSTANCE;
	
//	添加自己的功能处理
	public void singletonOperation() {
		
	}
}
