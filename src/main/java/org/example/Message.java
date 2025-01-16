package org.example;

public class Message {


    public static int id;
    private String name;
    private String title;
    private String content;

    public Message(int id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;


    }

    @Override
    public String toString() {
        return "Message{id=" + id + ", name='" + name + "', title='" + title + "', content='" + content + "'}";
    }
}
