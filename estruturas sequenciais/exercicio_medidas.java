import java.util.Locale;
import java.util.Scanner;

public class exercicio_medidas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, area_quadrado, area_triangulo, area_trapezio;

        System.out.print("Digite a medida A: ");
        a = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        c = sc.nextDouble();

        area_quadrado = a * a;
        area_triangulo = a * b / 2;
        area_trapezio = (a + b) * c / 2;

        System.out.println();
        System.out.println("AREA DO QUADRADO = " + String.format("%.4f", area_quadrado));
        System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", area_triangulo));
        System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", area_trapezio));

        sc.close();
    }
}