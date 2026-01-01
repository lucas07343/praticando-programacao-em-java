import java.util.Scanner;

public class exercicio_numeros_pares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, qte_pares;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }

        qte_pares = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                qte_pares += 1;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qte_pares);

        sc.close();
    }
}