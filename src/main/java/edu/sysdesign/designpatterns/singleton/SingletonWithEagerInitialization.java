package edu.sysdesign.designpatterns.singleton;

public class SingletonWithEagerInitialization {

	private static final SingletonWithEagerInitialization instance = new SingletonWithEagerInitialization();

	private SingletonWithEagerInitialization() {}

	public static SingletonWithEagerInitialization getInstance() {
		return instance;
	}

}
