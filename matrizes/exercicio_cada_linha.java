import java.util.Scanner;

public class exercicio_cada_linha {

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

        int n;

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

        int[][] mat = new int[n][n];
        int[] maiores =  new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            maiores[i] = mat[i][0];
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > maiores[i]) {
                    maiores[i] = mat[i][j];
                }
            }
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (int i = 0; i < n; i++) {
            System.out.println(maiores[i]);
        }

        sc.close();
    }
}