package org.example;

public class ShowAllMessage {
    public ShowAllMessage() {
    }

    public String showAllMessage() {
        for (Message message : MessageService.messageList) {
            System.out.println(message);
        }

        return "OK!!";
    }
}
