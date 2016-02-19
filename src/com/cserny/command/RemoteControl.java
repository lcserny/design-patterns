package com.cserny.command;

import com.cserny.command.Commands.NoCommand;

/**
 * Created by user on 19.02.2016.
 */
public class RemoteControl
{
    int numCommands = 4;
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl()
    {
        onCommands = new Command[numCommands];
        offCommands = new Command[numCommands];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numCommands; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
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
