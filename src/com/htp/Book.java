package com.htp;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private int yearOfPublishing;

    public Book() {}

    public Book(int id, String name, int yearOfPublishing) {
        this.id = id;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                yearOfPublishing == book.yearOfPublishing &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, yearOfPublishing);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}