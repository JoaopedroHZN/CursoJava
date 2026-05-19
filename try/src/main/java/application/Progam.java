package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        method1();
        System.out.println("End of Progam");
    }

    public static void method1(){
        System.out.println("---Method1 Start---");
        method2();
        System.out.println("---Method1 End---");
    }

    public static void method2(){
        System.out.println("---Method2 Start---");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){//Numero acima do indice fora da matriz
            System.out.println("Invalid position");
            e.printStackTrace();//Toda a chamada de metodos q acarretou naquela excecao
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Input Error");//Digitou o tipo de dado errado ex: String e digitou int
        }
        sc.close();
        System.out.println("---Method2 End---");
    }
}
