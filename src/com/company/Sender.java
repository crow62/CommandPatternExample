package com.company;

public class Sender {
    private final String SMS_NOTIFICATION = "SMS: Sent a message to your email";
    private final String SMS_LINK = "SMS: link to the profile";
    private final String EMAIL_MESSAGE = "EMAIL: Profile";


    public void executeFirstMode() {
        sendSms(SMS_LINK);
    }

    public void executeSecondMode() {
        sendSms(SMS_NOTIFICATION);
        sendMail(EMAIL_MESSAGE);
    }

    public void executeThirdMode() {
        executeFirstMode();
        executeSecondMode();
    }


    private void sendSms(String pattern) {
        System.out.println(pattern);
    }

    private void sendMail(String pattern) {
        System.out.println(pattern);
    }
}
