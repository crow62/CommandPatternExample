package com.company.command;

public class InvokerCommands {
    Command firstModeCommand;
    Command secondModeCommand;
    Command thirdModeCommand;

    public InvokerCommands(Command firstModeCommand, Command secondModeCommand, Command thirdModeCommand) {
        this.firstModeCommand = firstModeCommand;
        this.secondModeCommand = secondModeCommand;
        this.thirdModeCommand = thirdModeCommand;
    }

    public void invokeFirstCommand() {
        firstModeCommand.execute();
    }

    public void invokeSecondCommand() {
        secondModeCommand.execute();
    }

    public void invokeThirdCommand() {
        thirdModeCommand.execute();
    }

}
