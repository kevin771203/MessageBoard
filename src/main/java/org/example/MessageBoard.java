package org.example;

import java.util.ArrayList;

public class MessageBoard {


    public static final ArrayList<Message> messageList = new ArrayList<>();
    public static final resultMessage resultMessage = new resultMessage();

    public String addMessage(int id, String name, String title, String text) {
        messageList.add(new Message(id, name, title, text));

        for (Message message : messageList) {
            System.out.println(message);
        }

        return resultMessage.toString("addSuccessResult");
    }

    public String searchMessage(int id) {

        if (Message.id == id) {
            return messageList.toString();
        }else{
            return resultMessage.toString("notFoundResult");
        }

    }

    public String deleteMessage(int id) {

        if (Message.id == id) {
            messageList.remove(Message.id - 1);
            return resultMessage.toString("deleteSuccessResult");
        }else{
            return resultMessage.toString("notFound");
        }

    }
}