package command.invoker;

import command.commands.Command;
import command.commands.NoCommand;

import java.util.Stack;

public class RemoteControlWithUndo extends RemoteControl {

    private Stack<Command> commandHistory;

    public RemoteControlWithUndo() {
        super();
        //undoCommand = new NoCommand();
        commandHistory = new Stack();
    }

    @Override
    public void onButtonWasPushed(int slot) {
        super.onButtonWasPushed(slot);
        //undoCommand = onCommands[slot];
        commandHistory.push(onCommands[slot]);
    }

    @Override
    public void offButtonWasPushed(int slot) {
        super.offButtonWasPushed(slot);
        //undoCommand = offCommands[slot];
        commandHistory.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        //undoCommand.undo();
        if (commandHistory.empty()) {
            new NoCommand().execute();
        } else {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

}
