package org.example;

import java.util.ArrayList;

public class MessageBoard {


    public static final ArrayList<Message> messageList = new ArrayList<>();
    public static final resultMessage resultMessage = new resultMessage();

    public String addMessage(int id, String name, String title, String content) {
        messageList.add(new Message(id, name, title, content));
        return resultMessage.toString("addSuccessResult");
    }

    public String searchMessage(int id) {

        for (Message message : messageList) {
            if (message.getId() == id) {
                return message.toString();
            }
        }
        return resultMessage.toString("notFoundResult");

    }

    public String deleteMessage(int id) {

        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getId() == id) {
                messageList.remove(i);
                return resultMessage.toString("deleteSuccessResult");
            }
        }
            return resultMessage.toString("notFound");


    }


    public String setMessage(int id, String newName, String newTitle, String newContent) {

        for (Message message : messageList) {
            if (message.getId() == id) {
                message.setName(newName);
                message.setTitle(newTitle);
                message.setContent(newContent);
                return message.toString();
            }
        }
        return resultMessage.toString("notFoundResult");
    }

    public String allMessage() {
        for (Message message : messageList) {
            System.out.println(message);
            }

        return "OK!!";
    }
}