public class Ex04 {
    public static void main(String [] args){
        //Math.sqrt(x) recebe a raiz quadrada
        //Math.pow(x,y) recebe o resultado de x elevado a y
        //Math.abs(x) recebe o valor absoluto de x

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A,B,C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz Quadrada de " + x + " = " + A);
        System.out.println("Raiz Quadrada de " + y + " = " + B);
        System.out.println("Raiz Quadrada de 25 =  " + C);

        A = Math.pow(x,y);
        B = Math.pow(x,2.0);
        System.out.println(x + "Elevado a " + y + " = " + A);
        System.out.println(x + "Elevado ao Quadrado = " + B);
        System.out.println("5 Elevado ao Quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
