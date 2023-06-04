package com.bookclub.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;


public class WishlistItem {
    @NotNull
    @NotEmpty(message="ISBN is a required field.")
    private String isbn;

    @NotNull
    @NotEmpty(message="Title is a required field.")
    private String title;
    
    @Id
    private String id;

    private String username;

    public WishlistItem(){

    }

    public WishlistItem(String id, String isbn, String title, String username){
        setId(id);
        setIsbn(isbn);
        setTitle(title);
        setUsername(username);
    }

    public WishlistItem(String isbn, String title){
        setIsbn(isbn);
        setTitle(title);
    }

    public WishlistItem(String isbn, String title, String username){
        setIsbn(isbn);
        setTitle(title);
        setUsername(username);
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public void setIsbn(String newIsbn){
        this.isbn = newIsbn;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }


    @Override
    public String toString(){
        String template = "WishlistItem{id=%s, isbn=%s, title=%s, username=%s}";
        String output = String.format(template, getId(), getIsbn(), getTitle(), getUsername().toString());
        return output;
    }
}
