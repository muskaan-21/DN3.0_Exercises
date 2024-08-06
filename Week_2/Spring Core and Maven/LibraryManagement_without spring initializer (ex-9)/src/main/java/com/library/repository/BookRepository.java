package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void addBook() {
        System.out.println("Book added to the library.");
    }
}
