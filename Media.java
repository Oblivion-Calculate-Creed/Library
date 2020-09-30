package com.company;

import java.util.Calendar;
import java.util.Date;

public class Media extends Item{
    String name;
    String type; // type of media e.g dvd, cd, audiobook
    String category;

    public Media(int ID, String name, String type, String category) {
        super(ID);
        this.name = name;
        this.type = type;
        this.category = category;
    }
    
    @Override
    public void setDueDate(Date dueDate){
        int noOfDays = 14; // two weeks as due date as Media is in high demand
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.getCheckOutDate());
        calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date date = calendar.getTime();
        this.dueDate = date;
    }
}
