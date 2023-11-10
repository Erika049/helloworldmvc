package fr.exia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
    private static String FileName = "C:\\Users\\Simplice\\git\\helloworldmvc\\helloworldmaven\\helloworldmvc.modele\\src\\main\\java\\fr\\exia\\HelloWorld.txt";
    private DAOHelloWorld instance = null;
    private String helloWorldMessage = null;

    DAOHelloWorld(){

    }
    private static void getInstance(){
    }
    private void setInstance(DAOHelloWorld instance){

    }
    static String readFile() throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
    public String getHelloWorldMessage() {
        return helloWorldMessage;
    }

    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}
