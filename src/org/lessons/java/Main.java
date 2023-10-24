package org.lessons.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Perfavore inserire il numero di libri che vuoi aggiungere");
        int booksn = scan.nextInt();
        scan.nextLine();

        Book[] library = new Book[booksn];
        Boolean error = false;

        for (int i = 0; i < booksn; i++) {
            try {
                System.out.println("Inserire il titolo del "  + (i + 1) + "° libro");
                String title = scan.nextLine();
                System.out.println("Inserire il numero di pagine del " + (i + 1) + "° libro" );
                int pages = scan.nextInt();
                scan.nextLine();
                System.out.println("inserire il nome dell'autore del " + (i + 1) + "° libro");
                String author = scan.nextLine();
                System.out.println("inserire l'editore del " + (i + 1) + "° libro");
                String editor = scan.nextLine();

                library[i] = new Book(title, pages, author, editor );

            } catch (IllegalArgumentException e) {
                System.out.println(e);
                error = true;
                break;
            } catch (InputMismatchException e) {
                System.out.println("perfavore inserisci un numero");
                error = true;
                break;
            }
        }

        if(error == false) {
            for (int i = 0; i < library.length; i++){
                System.out.println("Libro " + (i + 1) + "): ");
                System.out.println("");
                System.out.println("Titolo: "+ library[i].getTitle());
                System.out.println("Numero pagine: " + library[i].getPages());
                System.out.println("Autore: " + library[i].getAuthor());
                System.out.println("Editore: " + library[i].getEditor());
                System.out.println("------------------------------------------");
            }

        }




    }

}
