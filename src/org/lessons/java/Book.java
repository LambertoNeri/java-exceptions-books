package org.lessons.java;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String editor;

    //costruttore
    public Book(String title, int pages, String author, String editor) throws IllegalArgumentException{

        if(pages <= 0 ) {
            throw new IllegalArgumentException("inserire un numero di pagine superiore a 0");
        } else if ( title == null || title.trim().isEmpty() ) {
            throw new IllegalArgumentException("il titolo non può essere vuoto");
        } else if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("l'autore non può essere vuoto");
        } else if (editor == null || editor.trim().isEmpty()) {
            throw new IllegalArgumentException("l'editore non può essere vuoto");
        }

        this.title = title;
        this.pages = pages;
        this.author = author;
        this.editor = editor;
    }

    //METODI







}
