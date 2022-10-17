package com.JavaChallenges.Book;



  abstract class Book {
    String BookTitle;
    double BookPrice;

    public Book(String title){
        BookTitle = title;
    }

    public String getTitle() {
        return BookTitle;
    }

    public double getPrice() {
        return BookPrice;
    }

    public abstract void setPrice();



    
}


