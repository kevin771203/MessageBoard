package org.example;

import java.util.ArrayList;

public class MessageBoard {


    public static final ArrayList<Message> messageList = new ArrayList<>();
    public static final resultMessage resultMessage = new resultMessage();
    private final org.example.addMessage addMessage = new addMessage();
    private final org.example.searchMessage searchMessage = new searchMessage();
    private final org.example.deleteMessage deleteMessage = new deleteMessage();
    private final org.example.setMessage setMessage = new setMessage();
    private final org.example.showAllMessage showAllMessage = new showAllMessage();

    public String addMessage(int id, String name, String title, String content) {
        return addMessage.addMessage(id, name, title, content);
    }

    public String searchMessage(int id) {

        return searchMessage.searchMessage(id);
    }

    public String deleteMessage(int id) {


        return deleteMessage.deleteMessage(id);
    }


    public String setMessage(int id, String newName, String newTitle, String newContent) {

        return setMessage.setMessage(id, newName, newTitle, newContent);
    }

    public String showAllMessage() {

        return showAllMessage.allMessage();
    }
}