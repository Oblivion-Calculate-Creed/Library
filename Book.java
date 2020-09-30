package com.company;

public class Book extends Item {
    String name;
    String author;
    String category;

    public Book(int ID, String name, String author, String category) {
        super(ID);
        this.name = name;
        this.author = author;
        this.category = category;
    }
}
