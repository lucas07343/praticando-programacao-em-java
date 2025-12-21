import java.util.Scanner;

public class exercicio_sequencia_impares {

    public static void temporizador(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;

        do {
            System.out.print("Digite o valor de X:(minimo 1) ");
            x = sc.nextInt();

            if (x < 1) {
                System.out.println("Valor invalido! favor tente novamente");
                temporizador(args);
            }
        } while (x < 1);

        System.out.println();
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}