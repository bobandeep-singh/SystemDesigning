package edu.sysdesign.designpatterns.mains;

import edu.sysdesign.designpatterns.proxy.CommandProcessorProxy;
import edu.sysdesign.designpatterns.proxy.ICommandProcessor;

public class ProxyPatternTest {
	
	public static void main(String[] args) {
		ICommandProcessor command = new CommandProcessorProxy("Boban", "QwertyN");
		try {
			//command.processCommand("IPCONFIG");
			command.processCommand("rm -f ABC.txt");
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}

}
