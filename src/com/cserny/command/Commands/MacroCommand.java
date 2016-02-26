package com.cserny.command.Commands;

import com.cserny.command.Command;

/**
 * Created by user on 26.02.2016.
 */
public class MacroCommand implements Command
{
    Command[] commands;

    public MacroCommand(Command[] commands)
    {
        this.commands = commands;
    }

    @Override
    public void execute()
    {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo()
    {
        for (Command command : commands) {
            command.undo();
        }
    }
}
