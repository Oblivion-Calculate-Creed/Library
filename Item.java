package com.company;

import java.util.Date;

public abstract class Item {
    private Date checkOutDate; // date in which the item was taken out
    protected Date dueDate; // date for the item to be returned
    private int ID;

    public Item(int ID) {
        this.ID = ID;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
