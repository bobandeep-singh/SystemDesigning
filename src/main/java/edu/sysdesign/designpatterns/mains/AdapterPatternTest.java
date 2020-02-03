package edu.sysdesign.designpatterns.mains;

import edu.sysdesign.designpatterns.adapter.SocketAdapter;
import edu.sysdesign.designpatterns.adapter.SocketClassAdapterImpl;
import edu.sysdesign.designpatterns.adapter.SocketObjectAdapterImpl;
import edu.sysdesign.designpatterns.adapter.Volt;

public class AdapterPatternTest {

	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volts();
		case 12: return sockAdapter.get12Volts();
		case 120: return sockAdapter.get120Volts();
		default: return sockAdapter.get120Volts();
		}
	}
	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}

}

