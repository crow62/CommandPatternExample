package com.company.command;

import com.company.Sender;

public class SecondModeCommand implements Command{

    private final Sender sender;

    public SecondModeCommand(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void execute () {
        sender.executeSecondMode();
    }
}
