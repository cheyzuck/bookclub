package com.bookclub.model;

public class Book {
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private String infoUrl;

    public Book(){
    }

    public Book(String isbn, String title, String description, int numOfPages, String infoUrl){
        setIsbn(isbn);
        setTitle(title);
        setDescription(description);
        setNumOfPages(numOfPages);
        setInfoUrl(infoUrl);
    }

    public Book(String isbn, String title, String infoUrl){
        setIsbn(isbn);
        setTitle(title);
        setInfoUrl(infoUrl);
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public int getNumOfPages(){
        return numOfPages;
    }

    public String getInfoUrl(){
        return infoUrl;
    }

    public void setIsbn(String newIsbn){
        this.isbn = newIsbn;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public void setNumOfPages(int newNumOfPages){
        this.numOfPages = newNumOfPages;
    }

    public void setInfoUrl(String newInfoUrl){
        this.infoUrl = newInfoUrl;
    }

    @Override
    public String toString(){
        String template = "Book{isbn=%s, title=%s, description=%s, numOfPages=%d, infoUrl=%s}";
        String output = String.format(template, getIsbn(), getTitle(), getDescription(), getNumOfPages(), getInfoUrl().toString());
        return output;    
    }
}