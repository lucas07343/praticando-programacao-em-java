import java.util.Scanner;
import java.util.Locale;

public class exericico_matriz_geral {

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

        int n, indice_linha, indice_coluna;
        double soma_positivos;

        do {
            System.out.print("Qual a ordem da matriz?(maximo 10) ");
            n = sc.nextInt();

            if (n > 10 || n < 0) {
                System.out.println();
                System.out.println("NUMERO INVALIDO\nFavor digitar novamente");
                System.out.println();
                temporizador(args);
            }
        } while(n > 10 || n < 0);
        System.out.println();

        double[][] mat = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        soma_positivos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > 0) {
                    soma_positivos += mat[i][j];
                }
            }
        }

        System.out.println();
        if (soma_positivos != 0) {
            System.out.println("SOMA DOS POSITIVOS: " + String.format("%.1f", soma_positivos));
        }
        else {
            System.out.println("NAO TEM NUMEROS POSITIVOS NA MATRIZ");
        }
        temporizador(args);

        System.out.println();
        System.out.print("Escolha uma linha: ");
        indice_linha = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%.1f", mat[indice_linha][i]) + " ");
        }
        temporizador(args);

        System.out.println();
        System.out.println();
        System.out.print("Escolha uma coluna: ");
        indice_coluna = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%.1f", mat[i][indice_coluna]) + " ");
        }
        temporizador(args);

        System.out.println();
        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%.1f", mat[i][i]) + " ");
        }
        temporizador(args);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%.1f", mat[i][j]) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}