package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String ascciArt = FigletFont.convertOneLine("Salut, Christophe !!!");
        System.out.println(ascciArt);
    }
}