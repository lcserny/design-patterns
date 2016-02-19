package com.cserny.command;

import com.cserny.command.Commands.GarageDoorCloseCommand;
import com.cserny.command.Commands.GarageDoorOpenCommand;
import com.cserny.command.Commands.LightOffCommand;
import com.cserny.command.Commands.LightOnCommand;

/**
 * Created by user on 19.02.2016.
 */
public class SimpleRemoteControlTest // client
{
    public static void main(String[] args)
    {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl(); // invoker
        Light light = new Light(); // receiver
        LightOnCommand lightOn = new LightOnCommand(light); // command, gets passed the receiver
        remoteControl.setCommand(lightOn); // invoker gets command
        remoteControl.buttonWasPressed(); // invoker runs the command

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        remoteControl.setCommand(doorOpenCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(doorCloseCommand);
        remoteControl.buttonWasPressed();
    }
}
