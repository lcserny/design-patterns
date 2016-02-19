package com.cserny.command;

import com.cserny.command.Commands.*;

/**
 * Created by user on 19.02.2016.
 */
public class RemoteLoader
{
    public static void main(String[] args)
    {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room Light");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
