package com.company;

public class NewsPaper extends Item {
    String name;
    int year;
    int week;
    String category;

    public NewsPaper(int ID, String name, int year, int week, String category) {
        super(ID);
        this.name = name;
        this.year = year;
        this.week = week;
        this.category = category;
    }
}
