import java.util.Scanner;

public class Ex02 {
    public static void main(String[]args){
        //Entrada de Dados
        //Tipo Scanner
//        String x;
        int a;
        Scanner sc = new Scanner(System.in);
        //x = sc.next();//Texto sem Espacos
        //System.out.println("Voce digitou: " + x);
        a = sc.nextInt();//Tipo Int

        System.out.println("Voce digitou: " + a);
        sc.close();


    }
}
