package com.JavaChallenges.Book;

public class BookArray {
    public static void bookArray(){
    Book books[] = new Book[2];
        books[0] = new Fiction("Harry Potter");
        books[1] = new NonFiction("Calculus");
    
            for(int i = 0; i < books.length; i++){
                System.out.println("Title-" + books[i].BookTitle + " " + "Cost-$" + books[i].BookPrice);
             }
}
}