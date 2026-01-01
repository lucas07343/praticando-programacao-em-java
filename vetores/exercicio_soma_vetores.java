import java.util.Scanner;

public class exercicio_soma_vetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] vet_a = new int[n];
        int[] vet_b = new int[n];
        int[] vet_c = new int[n];

        System.out.println();
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            vet_a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vet_b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vet_c[i] = vet_a[i] + vet_b[i];
        }

        System.out.println();
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            System.out.println(vet_c[i]);
        }

        sc.close();
    }
}