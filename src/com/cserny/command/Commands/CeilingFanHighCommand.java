package com.cserny.command.Commands;

import com.cserny.command.CeilingFan;
import com.cserny.command.Command;

/**
 * Created by user on 19.02.2016.
 */
public class CeilingFanHighCommand implements Command
{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo()
    {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
    }
}
