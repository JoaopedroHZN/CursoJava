import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double g = sc.nextDouble();

        double areaX = area(a, b, c);
        double areaY = area(d, e, g);

        showResult(high(areaX, areaY));

        sc.close();
    }

    public static double area(double x, double y, double z) {
        double p = (x + y + z) / 2.0;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }



    public static double high(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void showResult(double value) {
        System.out.println("Maior área = " + value);
    }
}
