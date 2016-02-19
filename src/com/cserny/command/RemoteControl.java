package com.cserny.command;

import com.cserny.command.Commands.NoCommand;

/**
 * Created by user on 19.02.2016.
 */
public class RemoteControl
{
    protected static final int numCommands = 7;
    protected Command[] onCommands;
    protected Command[] offCommands;
    protected Command undoCommand;

    public RemoteControl()
    {
        onCommands = new Command[numCommands];
        offCommands = new Command[numCommands];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numCommands; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed()
    {
        undoCommand.undo();
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n----------- Remote Control -----------\n");
        for (int i = 0; i < numCommands; i++) {
            buffer.append("[slot:" + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }

        return buffer.toString();
    }
}
