import java.util.Scanner;

public class exercicio_glicose {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double glicose;

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        if (glicose <= 100) {
            System.out.println();
            System.out.println("Classificacao: normal");
        }
        else if (glicose <= 140) {
            System.out.println();
            System.out.println("Classificacao: elevado");
        }
        else {
            System.out.println();
            System.out.println("Classificacao: diabetes");
        }

        sc.close();
    }
}