package ua.java.springLibrary.dao.interfaces;

import ua.java.springLibrary.entities.Author;
import ua.java.springLibrary.entities.Book;
import ua.java.springLibrary.entities.Genre;

import java.util.List;

public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
}
