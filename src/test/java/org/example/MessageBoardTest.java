package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MessageBoardTest {

    private MessageBoard messageBoard;

    @BeforeEach
    void setUp() {
        messageBoard.messageList.clear();
        messageBoard = new MessageBoard();
        messageBoard.addMessage(1, "Alice", "Hello", "Welcome!");
        messageBoard.addMessage(2, "Bob", "Question", "How to use this?");
        messageBoard.addMessage(3, "Charlie", "Feedback", "Great feature!");

    }

    @Test
    void _show_all_message() {

        String allMessage = messageBoard.showAllMessage();
        Assertions.assertThat(allMessage).isEqualTo("OK!!");

    }


    @Test
    void _add_message() {

        String addMessage = messageBoard.addMessage(4,"Kevin", "Suck", "Bitch!");
        Assertions.assertThat(addMessage).isEqualTo("add message success!!");

    }

    @Test
    void _search_message() {

        String searchMessage = messageBoard.searchMessage(2);
        Assertions.assertThat(searchMessage).isEqualTo("Message{id=2, name='Bob', title='Question', content='How to use this?'}");

    }

    @Test
    void _set_message() {

        String setMessage = messageBoard.setMessage(1,"Alice", "Hi", "Not you");
        Assertions.assertThat(setMessage).isEqualTo("Message{id=1, name='Alice', title='Hi', content='Not you'}");

    }

    @Test
    void _delete_message() {

        String deleteMessage = messageBoard.deleteMessage(2);
        Assertions.assertThat(deleteMessage).isEqualTo("delete message success!!");

    }

}