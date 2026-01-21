import java.util.Scanner;

public class exercicio_acima_diagonal {

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

        int n, soma, cont;

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

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        cont = 0;
        soma = 0;
        for (int i = 0; i < n; i++) {
            cont++;
            for (int j = cont; j < n; j++) {
                soma += mat[i][j];
            }
        }

        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);

        sc.close();
    }
}