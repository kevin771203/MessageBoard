package org.example;

public class Message {


    private int id;
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

    public int getId() {return id;}

    public void setName(String newName) {
        this.name = newName;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }
}
