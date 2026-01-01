import java.util.Scanner;
import java.util.Locale;

public class exercicio_maior_posicao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, indice_maior;
        double maior;

        System.out.print("Quanto numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        maior = vet[0];
        indice_maior = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                indice_maior = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
        System.out.println("POSICAO DO MAIOR VALOR = " + indice_maior);

        sc.close();
    }
}