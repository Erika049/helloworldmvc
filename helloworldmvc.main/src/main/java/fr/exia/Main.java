package fr.exia;

import java.io.IOException;
public class Main {
    public static void main(final String[] args) throws IOException {
        DAOHelloWorld daoHelloWorld = new DAOHelloWorld();
        System.out.println(DAOHelloWorld.readFile());
    }
}
