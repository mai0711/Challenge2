package com.JavaChallenges;


import com.JavaChallenges.Book.Fiction;
import com.JavaChallenges.Book.NonFiction;
import com.JavaChallenges.Book.BookArray;

public class App {
    public static void main(String[] args) throws Exception {

       
        Fiction fiction = new Fiction("Harry Potter");
        NonFiction nonFiction = new NonFiction("Calculus");

        System.out.println("Title of fiction book:"+ "\n" + fiction.showInfo());
        System.out.println("Title of non fiction book:"+ "\n" + nonFiction.showInfo());

        BookArray.bookArray();

        
        



        

              
    

        

    }
}
