package com.company;

import java.util.HashMap;

public class Person {
    private String name;
    private int id;
    private HashMap<Integer,Item> itemsInPossession = new HashMap<>();

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void checkOutItem(Item item){ // take a book from the library
        itemsInPossession.put(item.getID(),item);

    }

    public void checkInItem(int itemID){ // give a book back
        itemsInPossession.remove(itemID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Item> getItemsInPossession() {
        return itemsInPossession;
    }

    public void setItemsInPossession(HashMap<Integer, Item> itemsInPossession) {
        this.itemsInPossession = itemsInPossession;
    }

}
