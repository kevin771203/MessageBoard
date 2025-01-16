package org.example;

import java.util.List;
import java.util.ArrayList;

public class MessageBoard {


    public String addMessage(int id, String name, String title, String text) {
        ArrayList<Message> messageList = new ArrayList<>();
        messageList.add(new Message(id, name, title, text));

        for (Message message : messageList) {
            System.out.println(message);
        }

        resultMessage result = new resultMessage();

        return result.toString();
    }



}