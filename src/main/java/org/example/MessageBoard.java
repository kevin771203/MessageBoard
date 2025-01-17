package org.example;

public class MessageBoard {


    private final MessageService messageService;

    public MessageBoard(MessageService messageService) {
        this.messageService = messageService;
    }


    public String addMessage(int id, String name, String title, String content) {
        return messageService.addMessage.addMessage(id, name, title, content);
    }

    public String searchMessage(int id) {

        return messageService.searchMessage.searchMessage(id);
    }

    public String deleteMessage(int id) {


        return messageService.deleteMessage.deleteMessage(id);
    }


    public String updateMessage(int id, String newName, String newTitle, String newContent) {

        return messageService.updateMessage.updateMessage(id, newName, newTitle, newContent);
    }

    public String showAllMessage() {

        return messageService.ShowAllMessage.showAllMessage();
    }
}