package com.me.places.bookstore;

public interface BookstoreFactory {
    public Bookstore getBookstore(String ... titles);
}
