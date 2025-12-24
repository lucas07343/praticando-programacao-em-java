import java.util.Scanner;
import java.util.Locale;

public class exercicio_divisao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, numerador, denominador;
        double divisao;

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextInt();

            if (denominador == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
                System.out.println();
            }
            else {
                divisao = (double) numerador / denominador;
                System.out.println("DIVISAO = " + String.format("%.2f", divisao));
                System.out.println();
            }
        }

        sc.close();
    }
}