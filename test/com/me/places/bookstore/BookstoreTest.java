package com.me.places.bookstore;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookstoreTest {

    @Test
    public void test() {
        BookstoreFactory factory = Bookstore::new;
        
        Bookstore scientificBookstore = factory.getBookstore(
                "Surely you're joking, Mr. Feynman", 
                "The Selfish Gene", 
                "The Elegant Universe", 
                "Philosophiae Naturalis Principia Mathematica", 
                "The Voyage of the Beagle", 
                "On the Revolutions", 
                "What is Life", 
                "One, two, three ... Infinity", 
                "Dialogue concerning the Two Chief World Systems", 
                "Micrographia",
                "A Pale Blue Dot: A vision of the human Future in Space",
                "Parallel Worlds");
        
        Bookstore techBookstore = factory.getBookstore(
                "The Innovator's Dilemma",
                "The Soul of a New Machine",
                "The New New Thing",
                "The World is Flat",
                "The Chip",
                "Hackers: Heroes of the computer revolution",
                "Microcosm: The Quantum Revolution",
                "The Wisdom of Crowds",
                "The Long Tail",
                "Outliers",
                "The Age of Spiritual Machines",
                "Neuromancer");
    }

}
