package edu.sysdesign.designpatterns.singleton;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe instance;
	private SingletonThreadSafe() {}
	
	public static synchronized SingletonThreadSafe getInstance() {
		if(null == instance) {
			System.out.println("First time initialization of SingletonThreadSafe");
			instance = new SingletonThreadSafe();
		}
		return instance;
	}

}
