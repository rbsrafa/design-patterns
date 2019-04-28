package behavioral.command;

import behavioral.command.command.CloseFileCommand;
import behavioral.command.command.Command;
import behavioral.command.command.OpenFileCommand;
import behavioral.command.command.WriteFileCommand;
import behavioral.command.invoker.FileInvoker;
import behavioral.command.receiver.FileSystemReceiver;
import behavioral.command.receiver.FileSystemReceiverUtil;

public class CommandMain {
    
	public CommandMain() {
	  
	    //Creating the receiver object
	    FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
	    FileInvoker file;
	
	    //creating command and associating with receiver
	    Command openFileCommand = new OpenFileCommand(fs);
	
	    //Creating invoker and associating with Command
	    file = new FileInvoker(openFileCommand);
	
	    //perform action on invoker object
	    file.execute();
	
	    Command writeFileCommand = new WriteFileCommand(fs);
	    file = new FileInvoker(writeFileCommand);
	    file.execute();
	
	    Command closeFileCommand = new CloseFileCommand(fs);
	    file = new FileInvoker(closeFileCommand);
	    file.execute();
    
	}  
}
