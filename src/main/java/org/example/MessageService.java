package org.example;

import java.util.ArrayList;

public class MessageService {
    public static final ArrayList<Message> messageList = new ArrayList<>();
    public static final ResultMessage resultMessage = new ResultMessage();
    final AddMessage addMessage = new AddMessage();
    final SearchMessage searchMessage = new SearchMessage();
    final DeleteMessage deleteMessage = new DeleteMessage();
    final UpdateMessage updateMessage = new UpdateMessage();
    final org.example.ShowAllMessage ShowAllMessage = new ShowAllMessage();

    public MessageService() {
    }
}