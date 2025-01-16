package org.example;

public class searchMessage {
    public searchMessage() {
    }

    public String searchMessage(int id) {

        for (Message message : MessageBoard.messageList) {
            if (message.getId() == id) {
                return message.toString();
            }
        }
        return MessageBoard.resultMessage.toString("notFoundResult");

    }
}