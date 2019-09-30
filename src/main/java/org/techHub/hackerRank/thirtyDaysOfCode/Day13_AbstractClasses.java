package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 *  https://www.hackerrank.com/challenges/30-abstract-classes/problem
 */
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

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends  Book{
    private int price;
    MyBook(String t,String a, int p){
        super(t,a);
        this.price = p;
    }

    @Override
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}