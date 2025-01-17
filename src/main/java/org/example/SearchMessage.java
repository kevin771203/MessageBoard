package org.example;

public class SearchMessage {
    public SearchMessage() {
    }

    public String searchMessage(int id) {

        for (Message message : MessageService.messageList) {
            if (message.getId() == id) {
                return message.toString();
            }
        }
        return MessageService.resultMessage.toString("notFoundResult");

    }
}