package org.example;

public class SetMessage {
    public SetMessage() {
    }

    public String setMessage(int id, String newName, String newTitle, String newContent) {

        for (Message message : MessageBoard.messageList) {
            if (message.getId() == id) {
                message.setName(newName);
                message.setTitle(newTitle);
                message.setContent(newContent);
                return message.toString();
            }
        }
        return MessageBoard.resultMessage.toString("notFoundResult");
    }
}