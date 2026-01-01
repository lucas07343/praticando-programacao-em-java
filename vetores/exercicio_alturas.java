import java.util.Scanner;
import java.util.Locale;

public class exercicio_alturas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qte_menores;
        double media_alturas, soma_alturas, porcentagem_menores; 

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.println();
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            System.out.println();
        }

        soma_alturas = 0;
        qte_menores = 0;
        for (int i = 0; i < n; i++) {
            soma_alturas += alturas[i];

            if (idades[i] < 16) {
                qte_menores += 1;
            }
        }

        media_alturas = soma_alturas / n;
        porcentagem_menores = 100.00 / n + qte_menores;

        System.out.println("Altura média: " + String.format("%.2f", media_alturas));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem_menores) + "%");

        System.out.println();
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}