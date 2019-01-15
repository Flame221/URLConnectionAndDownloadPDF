package com.yourname;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Connecting...");
        try {
            String u = "https://www.cs.usfca.edu/~parrt/doc/java/JavaIO-notes.pdf";
            URL url = new URL(u);
            InputStream in = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream(new File("io_notes.pdf"));
            System.out.println("Connected");
            int length = -1;
            byte[] buffer = new byte[1024];
            System.out.println("Downloading...");
            while ((length = in.read(buffer)) > -1) {
                fileOutputStream.write(buffer, 0, length);
            }
            fileOutputStream.close();
            in.close();
            System.out.println("Process finished");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}