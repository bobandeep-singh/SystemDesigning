package edu.sysdesign.designpatterns.singleton;

public class SingletonBillPugh {

	private SingletonBillPugh() {}

	private static class BillPughHelper{
		private static final SingletonBillPugh instance = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return BillPughHelper.instance;
	}
}
