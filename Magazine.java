package com.company;

public class Magazine extends Item {
    String name;
    int year;
    int week;
    String category;

    public Magazine(int ID, String name, int year, int week, String category) {
        super(ID);
        this.name = name;
        this.year = year;
        this.week = week;
        this.category = category;
    }
}
