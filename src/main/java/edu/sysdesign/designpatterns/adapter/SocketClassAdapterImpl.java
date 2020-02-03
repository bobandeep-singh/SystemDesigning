package edu.sysdesign.designpatterns.adapter;

/*
 * Class Adapter – This form uses java inheritance and extends the source interface, in our case Socket class.
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volts() {
		return getVolt();
	}

	@Override
	public Volt get12Volts() {
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volts() {
		Volt v = getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
}
