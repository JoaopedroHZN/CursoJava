import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Switch case
        int x = sc.nextInt();
        String dia;
        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            default:
                dia = "Valor Invalido !";
                break;
        }
        System.out.println("Dia da Semana: " + dia);
        sc.close();
    }
}
