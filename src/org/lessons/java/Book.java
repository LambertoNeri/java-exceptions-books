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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if ( title == null || title.trim().isEmpty() ) {
            throw new IllegalArgumentException("il titolo non può essere vuoto");
        }
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) throws  IllegalArgumentException{
        if(pages <= 0 ) {
            throw new IllegalArgumentException("inserire un numero di pagine superiore a 0");
        }
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if ( author == null || author.trim().isEmpty() ) {
            throw new IllegalArgumentException("l'autore non può essere vuoto");
        }
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws IllegalArgumentException {
        if ( editor == null || editor.trim().isEmpty() ) {
            throw new IllegalArgumentException("l'editore non può essere vuoto");
        }
        this.editor = editor;
    }
}
