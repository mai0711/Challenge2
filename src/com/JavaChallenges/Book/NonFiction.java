package com.JavaChallenges.Book;

public class NonFiction extends Book {

    public NonFiction(String title){
        super(title);
        setPrice();
    }

    public void setPrice(){
        super.BookPrice = 37.99;
    }
    
    public String showInfo(){
        return super.getTitle();
    }
    
    
}
