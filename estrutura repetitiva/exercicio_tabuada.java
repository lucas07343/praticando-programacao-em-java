import java.util.Scanner;

public class exercicio_tabuada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, resultado;

        System.out.print("Deseja a tabuada para qual valor? ");
        x = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            resultado = x * i;
            System.out.println(x + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}