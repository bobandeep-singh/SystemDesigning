package edu.sysdesign.designpatterns.singleton;

public class SingletonWithDoubleCheckLocking {
	
	private static SingletonWithDoubleCheckLocking instance;
	private SingletonWithDoubleCheckLocking() {}
	
	public static SingletonWithDoubleCheckLocking getInstance() {
		if(null == instance) {
			synchronized (SingletonWithDoubleCheckLocking.class) {
				instance = new SingletonWithDoubleCheckLocking();
			}
		}
		return instance;
	}
}
