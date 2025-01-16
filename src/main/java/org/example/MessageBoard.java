package org.example;

import java.util.ArrayList;

public class MessageBoard {


    public static final ArrayList<Message> messageList = new ArrayList<>();

    public String addMessage(int id, String name, String title, String text) {
        messageList.add(new Message(id, name, title, text));

        for (Message message : messageList) {
            System.out.println(message);
        }

        resultMessage result = new resultMessage();
        return result.toString();
    }

    public String searchMessage(int id) {

        if (Message.id == id) {
            return messageList.toString();
        }else{
            return "Not found";
        }


    }
}