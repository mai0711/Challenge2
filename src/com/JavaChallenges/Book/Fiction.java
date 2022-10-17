package com.JavaChallenges.Book;


public class Fiction extends Book {

    public Fiction (String title){
        super(title);
        setPrice();
    }

    public void setPrice(){
        super.BookPrice = 24.99;
    }

    public String showInfo(){
        return super.getTitle();
    }

    
}
    
