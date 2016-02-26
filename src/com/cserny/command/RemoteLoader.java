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
        Stereo livingRoomStereo = new Stereo("Living Room Stereo");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        StereoOnWithCDCommand livingRoomStereoOnWithCDCommand = new StereoOnWithCDCommand(livingRoomStereo);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        StereoOffCommand livingRoomStereoOffCommand = new StereoOffCommand(livingRoomStereo);

        Command[] partyOn = {livingRoomLightOnCommand, livingRoomStereoOnWithCDCommand};
        Command[] partyOff = {livingRoomLightOffCommand, livingRoomStereoOffCommand};

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnCommand, partyOffCommand);

        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
    }
}
