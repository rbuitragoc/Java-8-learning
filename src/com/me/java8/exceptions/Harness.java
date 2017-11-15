package com.me.java8.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Harness {
    
    public static void main(String ... args ) {
        URL url = Harness.class.getResource("simplefile.txt");
        try (FileInputStream fis = new FileInputStream(new File(url.toURI()));) {
            int c;
            while((c = fis.read()) != -1) {
                System.out.print((char)c);
                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) { }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        catch (URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

}
