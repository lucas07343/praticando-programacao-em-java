import java.util.Scanner;
import java.util.Locale;

public class exercicio_media_pares {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, soma_pares, qte_pares;
        double media_pares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        qte_pares = 0;
        soma_pares = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                soma_pares += vet[i];
                qte_pares ++;
            }
        }

        System.out.println();
        if (qte_pares != 0) {
            media_pares = soma_pares / qte_pares;
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media_pares));
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}