import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int al = 0;
        int ga = 0;
        int di = 0;
        while (x != 4){
            if(x == 1){
                al = al + 1;
            }
            if(x ==2){
                ga = ga + 1;
            }
            if (x ==3){
                di = di + 1;
            }
            x = sc.nextInt();
        }
        System.out.println("Obrigado");
        System.out.println("Alcool:" + al);
        System.out.println("Gasolina:" + ga);
        System.out.println("Diesel:" + di);
        sc.close();
    }
}
