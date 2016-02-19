package com.cserny.command.Commands;

import com.cserny.command.Command;
import com.cserny.command.Light;

/**
 * Created by user on 19.02.2016.
 */
public class LightOffCommand implements Command
{
    Light light;

    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.off();
    }
}
