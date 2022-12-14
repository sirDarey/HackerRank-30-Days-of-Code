package _30DaysOfCode;

import java.util.Scanner;

/**
 *
 * @author Sir Darey
 */

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
    int price;
    
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    @Override
    void display() {
        System.out.println("Title: " +super.title);
        System.out.println("Author: " +super.author);
        System.out.println("Price: " +price);
    }
}

public class Day13_AbstractClasses {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
