package com.helx.单例初始化;

/**
 * 
 * @author Administrator
 *
 */
class Singleton1 {

	//初始化过程是什么？为什么结果i=1,j=0
	private static Singleton1 singleton = new Singleton1();
	static int i;
	static int j = 0;
//	private static Singleton1 singleton = new Singleton1();
	private Singleton1() {
		i++;
		j++;
	}
	public static Singleton1 getInstance() {
		return singleton;
	}
}

public class Singleton{
	public static void main(String[] args) {
		Singleton1.getInstance();
		System.out.println("i="+Singleton1.i+",j="+Singleton1.j);
	}
}

