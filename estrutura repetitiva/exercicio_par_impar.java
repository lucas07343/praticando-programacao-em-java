import java.util.Scanner;

public class exercicio_par_impar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, x;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x % 2 != 0 && x < 0) {
                System.out.println("IMPAR NEGATIVO");
            }
            else if (x % 2 != 0 && x > 0) {
                System.out.println("IMPAR POSITIVO");
            }
            else if (x % 2 == 0 && x < 0) {
                System.out.println("PAR NEGATIVO");
            }
            else if (x % 2 == 0 && x > 0) {
                System.out.println("PAR POSITIVO"); 
            }
            else {
                System.out.println("NULO");
            }

            System.out.println();
        }

        sc.close();
    }
}