import java.util.Scanner;

public class exercicio_negativos_matriz {

     public static void temporizador(String[] args) {
        try {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int n, m;

        do {
            System.out.print("Qual a quantidade de linhas da matriz?(maximo 10) ");
            n = sc.nextInt();

            if (n > 10 || n < 0) {
                System.out.println();
                System.out.println("NUMERO INVALIDO\nFavor digitar novamente");
                System.out.println();
                temporizador(args);
            }
        } while(n > 10 || n < 0);

        do {
            System.out.print("Qual a quantidade de colunas da matriz?(maximo 10) ");
            m = sc.nextInt();

            if (m > 10 || m < 0) {
                System.out.println();
                System.out.println("NUMERO INVALIDO\nFavor digitar novamente");
                System.out.println();
                temporizador(args);
            }
        } while(m > 10 || m < 0);

        System.out.println();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }

        sc.close();
    }
}