import java.util.Locale;
import java.util.Scanner;

public class exercicio_media_ponderada {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media, x1, x2, x3;

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite tres numeros:");
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            media = (x1 * 2 + x2 * 3 + x3 * 5) / 10;
            System.out.println("MEDIA = " + String.format("%.1f", media));
            System.out.println();
        }

        sc.close();
    }
}