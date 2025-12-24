import java.util.Scanner;

public class exercicio_fatorial {

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

        int n, fatorial;

        do {
            System.out.print("Digite o valor de N: ");
            n = sc.nextInt();

            if (n > 15 || n < 0) {
                System.out.println("Valor invalido, favor tente novamente");
                temporizador(args);
            }
        } while(n > 15 || n < 0);

        
        fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println();
        System.out.println("FATORIAL = " + fatorial);

        sc.close();
    }
}