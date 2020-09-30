package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
    	
    	//Create a library system with functionality to manage items and people within
    	//Rules: 
   		//At least 1 abstract class, 
 		//Each item should have at least one additional attribute unique to itself
    	//Use of polymorphism 
    	//Correct usage of access modifiers 
    	//Naming conventions and commenting adhered to appropriately				//At least 3 of: -Books, -Maps, -Government Docs, -Media Resource, -Newspaper, Magazines
        //All of the following: Checkout, Check-in, Add, Remove, Update item
    	//All of the following: Register, Delete, Update person 
    	//Implement an ID system in your item class, utilising class and a static integer variable
    	
    	System.out.println("Welcome to the library");
	
        Library nationalLibrary = new Library();
        nationalLibrary.addMember(new Person("Scotty Nic",12));
        
        Book book = new Book(12,"LOTR","J.R.R.Tolkien","Fantasy");
        book.setDueDate(new Date());
        
        Media media = new Media(13,"The Two Towers","DVD","Blockbuster");
        media.setCheckOutDate(new Date());
        media.setDueDate(new Date());
        
        System.out.println("Due Date: ");
        System.out.println(media.getDueDate());
        System.out.println("Enjoy your item!");
    }
}
