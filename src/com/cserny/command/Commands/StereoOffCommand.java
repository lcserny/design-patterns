package com.cserny.command.Commands;

import com.cserny.command.Command;
import com.cserny.command.Stereo;

/**
 * Created by user on 19.02.2016.
 */
public class StereoOffCommand implements Command
{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }

    @Override
    public void execute()
    {
        stereo.off();
    }

    @Override
    public void undo()
    {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(1);
    }
}
