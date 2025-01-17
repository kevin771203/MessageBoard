package org.example;

public class DeleteMessage {

    public DeleteMessage() {

    }

    public String deleteMessage(int id) {

            for (int i = 0; i < MessageService.messageList.size(); i++) {
                if (MessageService.messageList.get(i).getId() == id) {
                    MessageService.messageList.remove(i);
                    return MessageService.resultMessage.toString("deleteSuccessResult");
                }
            }
            return MessageService.resultMessage.toString("notFound");


    }

}
