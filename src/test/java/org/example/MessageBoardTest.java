package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class MessageBoardTest {

    @Test
    void add_message() {

        MessageBoard messageBoard = new MessageBoard();
        String addMessage = messageBoard.addMessage(1,"我的名字", "我的標題", "我的內容");
        Assertions.assertThat(addMessage).isEqualTo("add message success!!");

    }

    @Test
    void search_message() {

        MessageBoard messageBoard = new MessageBoard();
        String searchMessage = messageBoard.searchMessage(1);
        Assertions.assertThat(searchMessage).isEqualTo("[Message{id=1, name='我的名字', title='我的標題', content='我的內容'}]");
    
    }


}