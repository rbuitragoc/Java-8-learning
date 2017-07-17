package com.me.places.bookstore;

import java.util.Arrays;
import java.util.List;

public class Bookstore {

    List<String> titles;
    
    public Bookstore(String ...newTitles) {
        if (titles == null) {
            titles = Arrays.asList(newTitles);
        } else {
            titles.addAll(Arrays.asList(newTitles));
        }
    }
    
}
