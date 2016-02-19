package com.cserny.command.Commands;

import com.cserny.command.Command;
import com.cserny.command.GarageDoor;

/**
 * Created by user on 19.02.2016.
 */
public class GarageDoorCloseCommand implements Command
{
    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor garageDoor)
    {
        door = garageDoor;
    }

    @Override
    public void execute()
    {
        door.close();
    }

    @Override
    public void undo()
    {
        door.open();
    }
}
