package edu.sysdesign.designpatterns.proxy;

import java.io.IOException;

public class CommandProcessorImpl implements ICommandProcessor{

	@Override
	public void processCommand(String command) throws IOException {
		Runtime.getRuntime().exec(command);
		System.out.println("This command is executed: "+command);
		
	}

}
