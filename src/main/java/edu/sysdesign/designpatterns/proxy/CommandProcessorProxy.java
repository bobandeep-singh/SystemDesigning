package edu.sysdesign.designpatterns.proxy;

public class CommandProcessorProxy implements ICommandProcessor{

	boolean isAdmin;
	private ICommandProcessor processor;

	public CommandProcessorProxy(String userName, String password) {
		if("Boban".equalsIgnoreCase(userName) && "Qwerty".equalsIgnoreCase(password)){
			isAdmin = true;
			processor = new CommandProcessorImpl();
		}
	}

	@Override
	public void processCommand(String command) throws Exception {

		if(isAdmin) {
			processor.processCommand(command);
		} else {
			if(command.trim().startsWith("rm")) throw new Exception("This command is not allowed for this user");
			else processor.processCommand(command);
		}
	}

}
