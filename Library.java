package com.company;

import java.util.Date;
import java.util.HashMap;

public class Library {
    private HashMap<Integer,Item> items = new HashMap<>();
    private HashMap<Integer,Person> members = new HashMap<>();

    public void addMember(Person member){
        members.put(member.getId(), member);
    }

    public void removeMember(int memberID){
        members.remove(memberID);
    }

    public void addItem(Item item){
        items.put(item.getID(),item);
    }


    public void removeItem(int itemID){
        items.remove(itemID);

    }

    public void checkInItem(int itemID, int personID){
        Person personCheckingInTheirItem = members.get(itemID);
        personCheckingInTheirItem.getItemsInPossession().get(itemID).setDueDate(null); // reset due date
        personCheckingInTheirItem.getItemsInPossession().get(itemID).setCheckOutDate(null); // reset checkout date
        addItem(personCheckingInTheirItem.getItemsInPossession().get(itemID));
        members.get(personID).checkInItem(itemID);

    }

    public void checkOutItem(int itemID, int personID, Date dueDate){

        items.get(itemID).setCheckOutDate(new Date());
        items.get(itemID).setDueDate(dueDate);
        members.get(personID).checkOutItem(items.get(itemID));
        items.remove(itemID);

    }

    public HashMap<Integer, Item> getItems() {
        return items;
    }

    public HashMap<Integer, Person> getMembers() {
        return members;
    }
}
