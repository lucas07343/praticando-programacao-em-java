import java.util.Scanner;

public class exercicio_negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, qte_negativos;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        qte_negativos = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0) {
                qte_negativos += 1;
            }
        }

        System.out.println();
        if (qte_negativos != 0) {
            System.out.println("NUMEROS NEGATIVOS:");
            for (int i = 0; i < n; i++) {
                if (vet[i] < 0) {
                    System.out.println(vet[i]);
                }
            }
        }
        else {
            System.out.println("Nao tem numeros negativos");
        }

        sc.close();
    }
}