package org.example;

public class DeleteMessage {

    public DeleteMessage() {

    }

    public String deleteMessage(int id) {

            for (int i = 0; i < MessageBoard.messageList.size(); i++) {
                if (MessageBoard.messageList.get(i).getId() == id) {
                    MessageBoard.messageList.remove(i);
                    return MessageBoard.resultMessage.toString("deleteSuccessResult");
                }
            }
            return MessageBoard.resultMessage.toString("notFound");


    }

}
