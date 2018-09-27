package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String time;
    private int type;

    public Book(int id, String name, String author, String time, int type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.time = time;
        this.type = type;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", time='" + time + '\'' +
                ", type=" + type +
                '}';
    }
}
