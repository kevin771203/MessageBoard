package org.example;

public class ShowAllMessage {
    public ShowAllMessage() {
    }

    public String showAllMessage() {
        for (Message message : MessageBoard.messageList) {
            System.out.println(message);
        }

        return "OK!!";
    }
}
