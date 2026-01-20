import java.util.Scanner;
import java.util.Locale;

public class exercicio_soma_linhas {

    public static void temporizador(String[] args) {
        try {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m, n;

        do {
            System.out.print("Qual a quantidade de linhas da matriz?(maximo 10) ");
            n = sc.nextInt();

            if (n > 10 || n < 0) {
                System.out.println();
                System.out.println("NUMERO INVALIDO,\nFavor digitar novamente");
                temporizador(args);
                System.out.println();
            }
        } while(n > 10 || n< 0);

        do {
            System.out.print("Qual a quantidade de colunas da matriz?(maximo 10) ");
            m = sc.nextInt();

            if (n > 10 || n < 0) {
                System.out.println();
                System.out.println("NUMERO INVALIDO,\nFavor digitar novamente");
                temporizador(args);
                System.out.println();
            }
        } while(n > 10 || n< 0);
        
        System.out.println();

        double[][] mat = new double[n][m];
        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha: ");
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            vet[i] = 0;
            for (int j = 0; j < m; j++) {
                vet[i] += mat[i][j];
            }
        }

        System.out.println("VETOR GERADO:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(String.format("%.2f", vet[i]));
        }

        sc.close();
    }
}