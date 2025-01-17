package org.example;

public class SearchMessage {
    public SearchMessage() {
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