import java.util.Scanner;

public class exercicio_coordenadas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Valor de X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println();
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println();
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println();
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println();
            System.out.println("Q4");
        }
        else if (x != 0 && y == 0) {
            System.out.println();
            System.out.println("Eixo X");
        }
        else if (x == 0 && y != 0) {
            System.out.println();
            System.out.println("Eixo Y");
        }
        else {
            System.out.println();
            System.out.println("Origem");
        }

        sc.close();
    }
}