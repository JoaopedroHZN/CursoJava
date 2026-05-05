import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int soma = 0;

        // for (inicio, condicao, incremento)
        for (int i = 0; i < num;i++){
            int x = sc.nextInt();
            soma += x;

        }
        System.out.println(soma);
        sc.close();
    }
}
