package com.cserny.command;

/**
 * Created by user on 19.02.2016.
 */
public class SimpleRemoteControl
{
    Command slot;

    public SimpleRemoteControl() { }

    public void setCommand(Command command)
    {
        slot = command;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }
}
