package org.example;

public class AddMessage {
    public AddMessage() {
    }

    public String addMessage(int id, String name, String title, String content) {
        MessageBoard.messageList.add(new Message(id, name, title, content));
        return MessageBoard.resultMessage.toString("addSuccessResult");
    }
}