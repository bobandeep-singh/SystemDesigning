package edu.sysdesign.designpatterns.singleton;

public class SingletonLazyInitialization {
	
	private static SingletonLazyInitialization instance;
	private SingletonLazyInitialization() {}
	
	public static SingletonLazyInitialization getInstance() {
		if(null == instance) {
			System.out.println("This is the first instantiation of SingletonLazyInitialization class");
			instance = new SingletonLazyInitialization();
		}
		return instance;
	}
}
