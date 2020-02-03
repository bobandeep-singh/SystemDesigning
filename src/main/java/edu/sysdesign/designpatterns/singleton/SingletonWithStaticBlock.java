package edu.sysdesign.designpatterns.singleton;

public class SingletonWithStaticBlock {

	private static SingletonWithStaticBlock instance;
	private SingletonWithStaticBlock() {}

	static {
		try {
			instance = new SingletonWithStaticBlock();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static SingletonWithStaticBlock getInstance() {
		return instance;
	}
}