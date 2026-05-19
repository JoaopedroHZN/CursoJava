package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args){

        File file  = new File("/home/joaopedro/Documentos/in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());//Capturar o erro que Aconteceu
        }
        finally {
            if (sc != null){
                sc.close();
            }

        }
    }
}
