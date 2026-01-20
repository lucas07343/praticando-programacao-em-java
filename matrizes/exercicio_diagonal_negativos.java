import java.util.Scanner;

public class exercicio_diagonal_negativos {

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

        int n, qte_negativos;

        do {
            System.out.print("Qual a ordem da matriz?(maximo 10) ");
            n = sc.nextInt();

            if (n > 10 || n < 0) {
                System.out.println("NUMERO invalido,\nFavor digitar novamente");
                temporizador(args);
            }
        } while(n > 10 || n < 0);

        int[][] mat = new int[n][n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        qte_negativos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    qte_negativos ++;
                }
            }
        }

        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        if (qte_negativos != 0) {
            System.out.println("QUANTIDADE DE NEGATIVOS = " + qte_negativos);
        }
        else {
            System.out.println("A MATRIZ NAO TEM NUMERO NEGATIVOS");
        }

        sc.close();
    }
}