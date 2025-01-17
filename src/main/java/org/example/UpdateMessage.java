package org.example;

public class UpdateMessage {
    public UpdateMessage() {
    }

    public String updateMessage(int id, String newName, String newTitle, String newContent) {

        for (Message message : MessageService.messageList) {
            if (message.getId() == id) {
                message.setName(newName);
                message.setTitle(newTitle);
                message.setContent(newContent);
                return message.toString();
            }
        }
        return MessageService.resultMessage.toString("notFoundResult");
    }
}