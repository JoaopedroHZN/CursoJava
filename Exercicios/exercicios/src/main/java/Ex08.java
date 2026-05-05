import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String senha = "2002";
        while (!input.equals(senha)){
            System.out.println("Senha Invalida");
            input = sc.nextLine();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
