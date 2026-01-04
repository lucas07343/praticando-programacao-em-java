import java.util.Locale;
import java.util.Scanner;

public class exercicio_abaixo_da_media {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, cont;
        double media, soma;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }

        media = soma / n;

        System.out.println();
        System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));

        cont = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] < media) {
                cont ++;
            }
        }

        System.out.println();
        if (cont != 0) {
            System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
            for (int i = 0; i < n; i++) {
                if (vet[i] < media) {
                    System.out.println(vet[i]);
                }
            }
        }
        else {
            System.out.println("nao tem numeros abaixo da media");
        }

        sc.close();
    }
}