package com.maven.example;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        String name = "lucas alberto schlestein";
        System.out.println(name);
        name = WordUtils.capitalizeFully(name);
        System.out.println(name);
    }
}