package com.cserny.command.Commands;

import com.cserny.command.Command;
import com.cserny.command.Stereo;

/**
 * Created by user on 19.02.2016.
 */
public class StereoOnWithCDCommand implements Command
{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }

    @Override
    public void execute()
    {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(1);
    }
}
