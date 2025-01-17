package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MessageBoardTest {

    private MessageBoard messageBoard;

    @BeforeEach
    void setUp() {
        MessageService.messageList.clear();
        messageBoard = new MessageBoard(new MessageService());
        messageBoard.addMessage(1, "Alice", "Hello", "Welcome!");
        messageBoard.addMessage(2, "Bob", "Question", "How to use this?");
        messageBoard.addMessage(3, "Charlie", "Feedback", "Great feature!");

    }

    @Test
    void show_all_message() {

        String allMessage = messageBoard.showAllMessage();
        Assertions.assertThat(allMessage).isEqualTo("OK!!");

    }


    @Test
    void add_message() {

        Assertions.assertThat(messageBoard.addMessage(
                4,
                "Kevin",
                "Suck",
                "Bitch!"
        )).isEqualTo("add message success!!");

    }

    @Test
    void search_message() {

        Assertions.assertThat(messageBoard.searchMessage(2)).isEqualTo(
                "Message{id=2, " +
                        "name='Bob', " +
                        "title='Question', " +
                        "content='How to use this?'}"
        );

    }

    @Test
    void update_message() {

        Assertions.assertThat(messageBoard.updateMessage(
                1,
                "Alice",
                "Hi",
                "Not you"
        )).isEqualTo("Message{id=1, name='Alice', title='Hi', content='Not you'}");

    }

    @Test
    void delete_message() {

        Assertions.assertThat(messageBoard.deleteMessage(2)).isEqualTo("delete message success!!");

    }

}