package com.company;

public class Inventory {

    //Inventory is set up

    private String bookTitle;
    private String bookAuthor;
    private String bookYearOfPublication;
    private String bookIsbnNumber;


    //Overloaded constructor used.
    public Inventory(String bookTitle, String bookAuthor, String bookYearOfPublication, String bookIsbnNumber) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYearOfPublication = bookYearOfPublication;
        this.bookIsbnNumber = bookIsbnNumber;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYearOfPublication() {
        return bookYearOfPublication;
    }

    public void setBookYearOfPublication(String bookYearOfPublication) {
        this.bookYearOfPublication = bookYearOfPublication;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }




}
