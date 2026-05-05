import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        //Operadores de Atribuicao

//        Forma Curta ,Equivalente (Forma Longa)
//        a += b;     ,a = a + b;
//        a -= b;     ,a = a - b;
//        a *= b;     ,a = a * b;
//        a /= b;     ,a = a / b;
//        a %= b;     ,a = a % b;
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
        };
        System.out.println("O valor da conta e: " + conta);
        sc.close();
    }
}
