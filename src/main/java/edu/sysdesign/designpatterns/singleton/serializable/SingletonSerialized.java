package edu.sysdesign.designpatterns.singleton.serializable;

import java.io.Serializable;

public class SingletonSerialized implements Serializable {
	private static final long serialVersionUID = 4L;

	private SingletonSerialized() {}

	private static class HelperClass{
		private static final SingletonSerialized instance = new SingletonSerialized();
	}

	public static SingletonSerialized getInstance() {
		return HelperClass.instance;
	}
}
