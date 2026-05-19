package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Progam {
    public static void main(String[] args){
        String patch = "/home/joaopedro/Documentos/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(patch))) {
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

