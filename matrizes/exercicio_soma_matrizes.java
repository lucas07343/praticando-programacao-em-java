import java.util.Scanner;

public class exercicio_soma_matrizes {

    public static void temporizador(String[] args) {
        try {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, m;

        do {
            System.out.print("Quantas linhas vai ter cada matriz?(maximo 10) ");
            n = sc.nextInt();

            if (n > 10 || n < 0) {
                System.out.println();
                System.out.println("NUMERO INVALIDO\nFavor digitar novamente");
                System.out.println();
                temporizador(args);
            }
        } while(n > 10 || n < 0);

        do {
            System.out.print("Quantas colunas vai ter cada matriz?(maximo 10) ");
            m = sc.nextInt();

            if (m > 10 || m < 0) {
                System.out.println();
                System.out.println("NUMERO INVALIDO\nFavor digitar novamente");
                System.out.println();
                temporizador(args);
            }
        } while(m > 10 || m < 0);
        System.out.println();

        int[][] mat_A = new int[n][m];
        int[][] mat_B = new int[n][m];
        int[][] mat_C = new int[n][m];

        System.out.println("Digite os valores da matriz A:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat_A[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Digite os valores da matriz B:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat_B[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat_C[i][j] = mat_A[i][j] + mat_B[i][j];
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat_C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}