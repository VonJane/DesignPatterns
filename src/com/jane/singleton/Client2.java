package com.jane.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���Է���ͷ����л��ƽ�
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
		
//		ͨ������ֱ�ӵ���˽�й�����
//		Class<SingletonDemo5> clazz = (Class<SingletonDemo5>) Class.forName("com.jane.singleton.SingletonDemo5");
//		Constructor<SingletonDemo5> c = clazz.getDeclaredConstructor(null);
////		����Ȩ�޼��
//		c.setAccessible(true);
//		SingletonDemo5 s3 = c.newInstance();
//		SingletonDemo5 s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		
//		ͨ�������л�����������
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
