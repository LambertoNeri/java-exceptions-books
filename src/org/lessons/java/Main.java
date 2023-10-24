package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Perfavore inserire il numero di libri che vuoi aggiungere");
        int booksn = scan.nextInt();
        scan.nextLine();

        Book[] library = new Book[booksn];

        for (int i = 0; i < booksn; i++) {
            try {
                System.out.println("Inserire il titolo del "  + (i + 1) + "° libro");
                String title = scan.nextLine();
                System.out.println("Inserire il numero di pagine del " + (i + 1) + "° libro" );
                int pages = scan.nextInt();
                scan.nextLine();
                System.out.println("inserire il nome dell'autore del " + (i + 1) + "° libro");
                String author = scan.nextLine();
                System.out.println("inserire l'autore del " + (i + 1) + "° libro");
                String editor = scan.nextLine();

                library[i] = new Book(title, pages, author, editor );

            } catch (IllegalArgumentException e) {
                System.out.println(e);
                break;
            }
        }

        System.out.println(Arrays.toString(library));
    }

}
