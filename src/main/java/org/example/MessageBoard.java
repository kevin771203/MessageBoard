package org.example;

import java.util.ArrayList;

public class MessageBoard {


    public static final ArrayList<Message> messageList = new ArrayList<>();
    public static final ResultMessage resultMessage = new ResultMessage();
    private final AddMessage addMessage = new AddMessage();
    private final SearchMessage searchMessage = new SearchMessage();
    private final DeleteMessage deleteMessage = new DeleteMessage();
    private final SetMessage setMessage = new SetMessage();
    private final ShowAllMessage ShowAllMessage = new ShowAllMessage();

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

        return ShowAllMessage.showAllMessage();
    }
}