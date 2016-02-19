package com.cserny.command.Commands;

import com.cserny.command.Command;
import com.cserny.command.GarageDoor;

/**
 * Created by user on 19.02.2016.
 */
public class GarageDoorOpenCommand implements Command
{
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor garageDoor)
    {
        door = garageDoor;
    }

    @Override
    public void execute()
    {
        door.open();
    }

    @Override
    public void undo()
    {
        door.close();
    }
}
