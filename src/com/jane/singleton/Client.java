package com.jane.singleton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonDemo4 instance = SingletonDemo4.INSTANCE;
		SingletonDemo4 instance1 = SingletonDemo4.INSTANCE;
		System.out.println(instance == instance1);
	}

}
