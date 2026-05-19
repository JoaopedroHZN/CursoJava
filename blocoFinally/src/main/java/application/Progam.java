package application;

import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args){
        String home = System.getProperty("user.home");
        File file = new File(home + "/Documentos/in.txt");
        Scanner sc = null;
        try {
            sc  = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error Opening file:" + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
