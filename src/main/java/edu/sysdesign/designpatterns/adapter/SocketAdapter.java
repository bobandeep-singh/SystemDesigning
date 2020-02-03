package edu.sysdesign.designpatterns.adapter;

/*
 * Now we want to build an adapter that can produce 3 volts, 12 volts and default 120 volts.
 * So, first of all, we will create an adapter interface with these methods.
 */
public interface SocketAdapter {
	
	public Volt get120Volts();
	
	public Volt get12Volts();
	
	public Volt get3Volts();

}
