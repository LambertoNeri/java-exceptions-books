package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inizializzo filewriter a null
        FileWriter fileWriter = null;
        //inizializzo scanner
        Scanner scan = new Scanner(System.in);

        // chiedo all'utente quanti libri vuole inserire
        System.out.println("Perfavore inserire il numero di libri che vuoi aggiungere");
        int booksn = scan.nextInt();
        scan.nextLine();

        //creo array library
        Book[] library = new Book[booksn];
        // mi creo variabile boolean d'errore per bloccare il programma
        Boolean error = false;

        //ciclo for contente try and catch per chiedere l'inserimento dei dati del libro
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
        // creo if per determinare se ho ricevuto un errore e stampare a schermo i vari dati dei libri
        if(error == false) {
            try {
                //provo ad aprire il fileWriter
                fileWriter = new FileWriter("./resources/data.txt");
                //provo a scriverci sopra
                for (int i = 0; i < library.length; i++){
                    fileWriter.write("Libro " + (i + 1) + "): \n");
                    fileWriter.write("Titolo: "+ library[i].getTitle() + "\n");
                    fileWriter.write("Numero pagine: " + library[i].getPages() + "\n");
                    fileWriter.write("Autore: " + library[i].getAuthor() + "\n");
                    fileWriter.write("Editore: " + library[i].getEditor() + "\n");
                    fileWriter.write("------------------------------------------\n");
                }
            } catch (IOException e ) {  //se si solleva un'eccezione passo dal catch
                System.out.println("unable to write file");
            } finally {
                //sia che ho terminato il try, sia che sono entrato nel catch passo da qui
                try{
                    if (fileWriter != null) {
                        System.out.println("Chiudo il file");
                        fileWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //provo a leggere il file
            Scanner fileReader = null;

            try{
                fileReader = new Scanner(new File("./resources/data.txt"));
                while (fileReader.hasNextLine()){
                    String line = fileReader.nextLine();
                    System.out.println(line);
                }
            }catch (FileNotFoundException e) {
                System.out.println("File non trovato");
            } finally {
                if (fileReader != null) {
                    fileReader.close();
                }
            }
        }
        scan.close();
    }

}
