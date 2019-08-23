package com.htp;

import java.util.ArrayList;
import java.util.List;

import static com.htp.Util.searchForSpecialBook;

public class Main {
    public static void main(String[] args) {
	    // Создать класс (или заиспользовать существующий) Книга, поместить в список несколько книг.
        // Написать метод, который будет искать нужную книгу по различным параметрам , и в случае
        // не нахождения нужного объекта бросать custom exception (ResourceNotFoundException)
        // который будет анчекд. В методе мейн необходимо его обработаьь и вывести на консоль
        // сообщение о зафейленном поиске.

        List<Book> books = new ArrayList<>();

        books.add(new Book(1, "Book1", 1996));
        books.add(new Book(2, "Book11", 2004));
        books.add(new Book(3, "Book1111", 2013));
        books.add(new Book(4, "Book111111", 1991));
        books.add(new Book(5, "Book1111111", 2000));

        try {
            try {
                System.out.println(searchForSpecialBook(books, 2000));
            } catch (RuntimeException e) {
                throw new ResourceNotFoundException("Опа! Нежданчик! чирик!) а лучше ошибку в плечи!)");
            }
        } catch (ResourceNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
