import java.util.Scanner;
import java.util.Locale;

public class exercicio_soma_vetor {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(String.format("%.1f", vet[i]) + " ");
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }

        media = soma / n;

        System.out.println("SOMA = " + String.format("%.2f", soma));
        System.out.println("MEDIA = " + String.format("%.2f", media));

        sc.close();
    }
}