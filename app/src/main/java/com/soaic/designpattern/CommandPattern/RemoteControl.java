package com.soaic.designpattern.CommandPattern;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        if(slot >= 0 && slot < 7) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    public void offButtonWasPushed(int slot){
        if(slot >= 0 && slot < 7) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}