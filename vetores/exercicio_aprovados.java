import java.util.Scanner;
import java.util.Locale;

public class exercicio_aprovados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        double media;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] notas_1 = new double[n];
        double[] notas_2 = new double[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            notas_1[i] = sc.nextDouble();
            notas_2[i] = sc.nextDouble();
            System.out.println();
        }

        System.out.println("Alunos aprovados:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            media = (notas_1[i] + notas_2[i]) / 2;

            if (media >= 6) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}