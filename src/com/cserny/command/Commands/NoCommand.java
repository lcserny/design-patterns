package com.cserny.command.Commands;

import com.cserny.command.Command;

/**
 * Created by user on 19.02.2016.
 */
public class NoCommand implements Command
{
    @Override
    public void execute()
    {
        // nothing wil be done here
    }

    @Override
    public void undo()
    {
        // nothing wil be done here
    }
}
