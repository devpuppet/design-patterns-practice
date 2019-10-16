package command.invoker;

import command.commands.Command;
import command.commands.NoCommand;

public class RemoteControl {
    protected Command[] onCommands;
    protected Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i =0; i<7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("\n--- %s ---\n", this.getClass().getSimpleName()));
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append(String.format("[slot %s] %s | %s\n",
                    i,
                    onCommands[i].getClass().getSimpleName(),
                    offCommands[i].getClass().getSimpleName()));
        }
        return stringBuffer.toString();
    }

}
