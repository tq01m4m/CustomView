// BookManager.aidl
package com.qkl.aidl;

// Declare any non-default types here with import statements
import com.qkl.aidl.Book;

interface BookManager {
    List<Book> getBooks();
    void addBook(in Book book);
}
