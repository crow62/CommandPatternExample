package com.company.command;

import com.company.Sender;

public class ThirdModeCommand implements Command {

    private final Sender sender;

    public ThirdModeCommand(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void execute () {
        sender.executeThirdMode();
    }
}
