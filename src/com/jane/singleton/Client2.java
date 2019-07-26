package com.jane.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解
 * @author 15142
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SingletonDemo5 s1 = SingletonDemo5.getInstance();
		SingletonDemo5 s2 = SingletonDemo5.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
//		通过反射直接调用私有构造器
//		Class<SingletonDemo5> clazz = (Class<SingletonDemo5>) Class.forName("com.jane.singleton.SingletonDemo5");
//		Constructor<SingletonDemo5> c = clazz.getDeclaredConstructor(null);
////		跳过权限检查
//		c.setAccessible(true);
//		SingletonDemo5 s3 = c.newInstance();
//		SingletonDemo5 s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		
//		通过反序列化构造多个对象
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo5 s3 =  (SingletonDemo5)ois.readObject();
		System.out.println(s3);
		ois.close();
	}

}
