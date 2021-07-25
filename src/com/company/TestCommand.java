package com.company;

import com.company.command.*;

public class TestCommand {

    public static void main(String[] args) {

        Sender sender = new Sender();
        Command firstModeCommand = new FirstModeCommand(sender);
        Command secondModeCommand = new SecondModeCommand(sender);
        Command thirdModeCommand = new ThirdModeCommand(sender);

        InvokerCommands invokerCommands = new InvokerCommands(firstModeCommand, secondModeCommand, thirdModeCommand);

        invokerCommands.invokeFirstCommand();
        System.out.println("___________");
        invokerCommands.invokeSecondCommand();
        System.out.println("___________");
        invokerCommands.invokeThirdCommand();


    }
}
