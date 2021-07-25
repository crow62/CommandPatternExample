package com.company.command;

import com.company.Sender;

public class FirstModeCommand implements Command{

    private Sender sender;

    public FirstModeCommand(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void execute () {
        sender.executeFirstMode();
    }
}
